package no.nav.rapidsandriversgrapher

import com.fasterxml.jackson.databind.JsonNode
import kotlinx.serialization.json.*

interface Hendelse {
    fun systemKart(): Set<Node>
}

class UgyldigHendelse(e: Exception) : Hendelse {
    init {
        log.warn("ignorerer hendelse som kaster feilmelding ved parsing", e)
    }
    override fun systemKart(): Set<Node> = emptySet()
}

class GyldigHendelse private constructor(private val besøkteServicer: List<String>): Hendelse {
    override fun systemKart(): Set<Node> {
        val noder = besøkteServicer.indices.map { Node.fra(besøkteServicer[it])}
        (0 until besøkteServicer.size-1).forEach { noder[it].pathTo(noder[it+1]) }
        return noder.toSet()
    }

    companion object {
        fun String.tilHendelse() = try {
            GyldigHendelse(parseBesøkteServicer())
        } catch (e: Exception) {
            UgyldigHendelse(e)
        }
    }
}

private fun String.parseBesøkteServicer(): List<String> =
    Json.parseToJsonElement(this).jsonObject["system_participating_services"]
        ?.jsonArray?.map { it.jsonObject["service"] }?.map { (it.asTextNullable()) ?: throw Exception("Klarte ikke hente ut service-felt fra system_participating_services") } ?: emptyList()


fun JsonElement?.asTextNullable() = this?.jsonPrimitive?.content