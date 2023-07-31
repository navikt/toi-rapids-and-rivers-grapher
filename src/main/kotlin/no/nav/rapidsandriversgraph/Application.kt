package no.nav.rapidsandriversgraph

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.isActive
import no.nav.rapidsandriversgraph.Event.Companion.tilEvent
import org.apache.kafka.clients.CommonClientConfigs
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.config.SslConfigs
import org.apache.kafka.common.serialization.StringDeserializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.time.temporal.ChronoUnit

val log: Logger = LoggerFactory.getLogger("no.nav.rapidsandriversgraph")

fun startApplication(mermaidWriter: (String) -> Unit, envs: Map<String, String>) {
    val consumer = KafkaConsumer<String,String>(consumerConfig(envs))
    val topics = listOf(TopicPartition("toi.rapid-1", 0))
    consumer.assign(topics)
    consumer.seekToEnd(topics)
    val lesTilOffset = consumer.position(topics[0])
    log.info("Topic ${topics[0]} er nå på posisjon: $lesTilOffset")
    consumer.seekToBeginning(topics)
    val graph = Graph()
    while (lesTilOffset>consumer.position(topics[0])) {
        log.info("Posisjonen er: ${consumer.position(topics[0])}")
        consumer.poll(Duration.ofSeconds(1))
            .map {it.tilEvent()}
            .forEach(graph::lesInnEvent)
    }
    mermaidWriter(
        "```mermaid\n${graph.tilMermaidGraph()}\n```\n"
                + graph.tilMermaidGraphPerEvent()
            .map { (eventName, mermaidGraph) ->
                "<details><summary>$eventName</summary>\n\n```mermaid\n$mermaidGraph\n```\n\n</details>"
            }.joinToString(separator = "\n")
    )
}

fun consumerConfig(envs: Map<String, String>) = mutableMapOf<String, Any>(
    ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG to "false",
    ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG to StringDeserializer::class.java,
    ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG to StringDeserializer::class.java,
    CommonClientConfigs.SECURITY_PROTOCOL_CONFIG to "PLAINTEXT",
    CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG to envs.hentEllerFeil("KAFKA_BROKERS")
).apply {
    envs["KAFKA_KEYSTORE_PATH"]?.let {
        put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL")
        put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, envs.hentEllerFeil("KAFKA_CREDSTORE_PASSWORD"))
        put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, envs.hentEllerFeil("KAFKA_CREDSTORE_PASSWORD"))
        put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, envs.hentEllerFeil("KAFKA_TRUSTSTORE_PATH"))
        put(SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, it)
    }
}

fun main() {
    val envs = System.getenv()
    var filecontent: String? = null
    embeddedServer(Netty, 8080) {
        install(Routing) {
            get("schema") {
                if(call.request.header("Authorization")?.replace("Bearer ", "")!=envs["SECRET_API_CODE"]) {
                    call.respond(HttpStatusCode.Unauthorized)
                } else {
                    filecontent?.let {
                        call.respond(HttpStatusCode.OK, it)
                        System.exit(0)
                    } ?: call.respond(HttpStatusCode.NoContent)
                }
            }
        }
    }.start(wait = true)
    startApplication({filecontent = it}, envs)
    val start = now()
    while (ChronoUnit.HOURS.between(start, now()) < 3) {
        Thread.sleep(10_000)
    }
    log.error("/schema not called within 3 hours. Shutting down.")
}

private fun Map<String, String>.hentEllerFeil(key: String) = get(key) ?: feil("$key er ikke satt")

fun feil(s: String): String {
    throw Exception(s)
}
