package no.nav.rapidsandriversgraph

class Graph {
    private var systemKart = setOf<Node>()
    fun lesInnHendelse(hendelse: Hendelse) {
        systemKart = systemKart `merge med` hendelse.systemKart()
    }

    fun tilMermaidGraph() =
            systemKart
                .flatMap(Node::toEdges)
                .map(Edge::toMermaidInstruction)
                .toSortedSet()
                .joinToString(
                    separator = "\n",
                    prefix = "```mermaid\ngraph TD;\n",
                    postfix = "\n```")

    fun tilMermaidGraphPerEvent(): Map<String, String> {
        TODO("Not yet implemented")
    }
}