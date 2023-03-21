package no.nav.rapidsandriversgrapher

class Grapher {
    private var systemKart = setOf<Node>()
    fun lesHendelse(hendelse: Hendelse) {
        systemKart = systemKart `merge med` hendelse.systemKart()
    }

    fun tilMermaid() =
            systemKart
                .map(Node::toMermaid)
                .toSortedSet()
                .joinToString(
                    separator = "\n",
                    prefix = "```mermaid\ngraph TD;\n",
                    postfix = "\n```")
}