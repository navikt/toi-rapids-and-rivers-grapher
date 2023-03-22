package no.nav.rapidsandriversgraf

class Graf {
    private var systemKart = setOf<Node>()
    fun lesInnHendelse(hendelse: Hendelse) {
        systemKart = systemKart `merge med` hendelse.systemKart()
    }

    fun tilMermaidGraf() =
            systemKart
                .flatMap(Node::toEdges)
                .map(Edge::toMermaidInstruction)
                .toSortedSet()
                .joinToString(
                    separator = "\n",
                    prefix = "```mermaid\ngraph TD;\n",
                    postfix = "\n```")

    fun tilMermaidGrafPerEvent(): Map<String, String> {
        TODO("Not yet implemented")
    }
}