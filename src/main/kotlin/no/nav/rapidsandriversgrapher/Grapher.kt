package no.nav.rapidsandriversgrapher

class Grapher {
    private var systemKart = setOf<Node>()
    fun lesHendelse(hendelse: Hendelse) {
        systemKart = systemKart `merge med` hendelse.systemKart()
    }

    fun tilMermaid() = "```mermaid\n" +
            "graph TD;\n" +
            systemKart.joinToString("\n", transform = Node::toMermaid) +
            "\n```"

}