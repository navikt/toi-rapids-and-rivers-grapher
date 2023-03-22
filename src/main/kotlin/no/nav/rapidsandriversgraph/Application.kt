package no.nav.rapidsandriversgraph

import org.apache.kafka.clients.CommonClientConfigs
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.config.SslConfigs
import org.apache.kafka.common.serialization.StringDeserializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.time.Duration

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
    mermaidWriter(graph.tilMermaidGraph())
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

fun main() = startApplication(log::info, System.getenv())


private fun Map<String, String>.hentEllerFeil(key: String) = get(key) ?: feil("$key er ikke satt")

fun feil(s: String): String {
    throw Exception(s)
}
