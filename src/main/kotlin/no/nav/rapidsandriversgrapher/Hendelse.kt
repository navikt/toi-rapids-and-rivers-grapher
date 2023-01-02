package no.nav.rapidsandriversgrapher

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

class Hendelse private constructor(private val besøkteServicer: List<String>) {

    constructor(hendelseString: String) : this(hendelseString.parseBesøkteServicer())

    fun systemKart(): Set<Node> {
        val noder = besøkteServicer.indices.map { Node.fra(besøkteServicer[it])}
        (0 until besøkteServicer.size-1).forEach { noder[it].pathTo(noder[it+1]) }
        return noder.toSet()
    }

}

private fun String.parseBesøkteServicer() =
    Json.parseToJsonElement(this).jsonObject["system_participating_services"]?.jsonArray?.map { it.jsonObject["service"] }?.map { it?.jsonPrimitive?.content ?: throw Exception("Klarte ikke hente ut service-felt fra system_participating_services") } ?: emptyList()