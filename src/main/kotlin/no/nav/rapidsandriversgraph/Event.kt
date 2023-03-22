package no.nav.rapidsandriversgraph

import kotlinx.serialization.json.*
import org.apache.kafka.clients.consumer.ConsumerRecord

interface Event {
    fun toNodes(): Set<Node>
    operator fun plus(eventNames: Set<String>): Set<String>
}

class InvalidEvent(e: Exception) : Event {
    init {
        log.warn("ignorerer event som kaster feilmelding ved parsing", e)
    }

    override fun toNodes(): Set<Node> = emptySet()
    override fun plus(eventNames: Set<String>) = eventNames
}

class ValidEvent(private val eventName: String, private val besøkteRapidServicer: List<String>) : Event {
    override fun toNodes(): Set<Node> {
        val noder = besøkteRapidServicer.indices.map { Node.fra(besøkteRapidServicer[it]) }
        (0 until besøkteRapidServicer.size - 1).forEach { noder[it].addEdgeTo(noder[it + 1], eventName) }
        return noder.toSet()
    }

    override fun plus(eventNames: Set<String>) = eventNames + eventName
}

private fun String.parseEventName(): String =
    Json.parseToJsonElement(this).jsonObject["@event_name"].asTextNullable() ?: "unknown event"

private fun String.parseBesøkteServicer(): List<String> =
    Json.parseToJsonElement(this).jsonObject["system_participating_services"]
        ?.jsonArray?.map { it.jsonObject["service"] }?.map {
            (it.asTextNullable())
                ?: throw Exception("Klarte ikke hente ut service-felt fra system_participating_services")
        } ?: emptyList()


fun JsonElement?.asTextNullable() = this?.jsonPrimitive?.content

fun ConsumerRecord<String, String>.tilEvent() = try {
    ValidEvent(value().parseEventName(), value().parseBesøkteServicer())
} catch (e: Exception) {
    InvalidEvent(e)
}