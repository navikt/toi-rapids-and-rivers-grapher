package no.nav.rapidsandriversgraf

import org.apache.kafka.clients.CommonClientConfigs
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.config.SaslConfigs
import org.apache.kafka.common.serialization.StringSerializer
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.testcontainers.containers.KafkaContainer
import org.testcontainers.utility.DockerImageName
import java.lang.Thread.sleep

class ITest {

    @Test
    fun test() {
        val mermaids = mutableListOf<String>()
        val mermaidSpy: (String) -> Unit = {mermaids.add(it)}
        val producer = KafkaProducer<String,String>(producerProperties())
        hendelser.forEach { producer.send(ProducerRecord(topic, it)) }
        sleep(1000)
        startApplication(mermaidSpy, mapOf(
            "KAFKA_BROKERS" to kafkaContainer.bootstrapServers
        ))
        assertEquals(1, mermaids.size)
        assertEquals("""
            ```mermaid
            graph TD;
            rekrutteringsbistand-stilling-api;
            toi-arbeidsmarked-cv --> toi-sammenstille-kandidat;
            toi-identmapper --> toi-sammenstille-kandidat;
            toi-oppfolgingsinformasjon --> toi-identmapper;
            toi-oppfolgingsperiode --> toi-sammenstille-kandidat;
            toi-sammenstille-kandidat --> toi-synlighetsmotor;
            toi-synlighetsmotor;
            ```
        """.trimIndent(), mermaids[0])
    }
    companion object {
        private val kafkaContainer = KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.3.1"))
        private val topic = "toi.rapid-1"
        private fun producerProperties() = mutableMapOf<String, Any>(
            CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG to kafkaContainer.bootstrapServers,
            CommonClientConfigs.SECURITY_PROTOCOL_CONFIG to "PLAINTEXT",
            SaslConfigs.SASL_MECHANISM to "PLAIN",
            ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java,
            ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java
        )

        @JvmStatic
        @BeforeAll
        fun startUp() {
            kafkaContainer.start()
        }

        @JvmStatic
        @AfterAll
        fun tearDown() {
            kafkaContainer.stop()
        }
    }
}
