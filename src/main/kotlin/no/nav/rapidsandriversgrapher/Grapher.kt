package no.nav.rapidsandriversgrapher

class Grapher {
    private val hendelser = mutableListOf<Hendelse>()
    fun lesHendelse(hendelse: Hendelse) {
        hendelser+=hendelse
    }

    fun tilMermaid() = "```mermaid\n" +
            "graph TD;\n" +
            hendelser.map(Hendelse::systemKart).reduce { acc, list -> acc `merge med` list }
                .joinToString("\n", transform = Node::toMermaid) +
            "\n```"

}