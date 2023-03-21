package no.nav.rapidsandriversgrapher

class Grapher {
    private var systemKart = setOf<Node>()
    fun lesHendelse(hendelse: Hendelse) {
        systemKart = systemKart `merge med` hendelse.systemKart()
    }

    fun tilMermaidGraph() =
            systemKart
                .map(Node::toMermaid)
                .toSortedSet()
                .joinToString(
                    separator = "\n",
                    prefix = "```mermaid\ngraph TD;\n",
                    postfix = "\n```")

    fun tilMermaidGraphPerEvent(): Map<String, String> {
        TODO("Not yet implemented")
    }
}