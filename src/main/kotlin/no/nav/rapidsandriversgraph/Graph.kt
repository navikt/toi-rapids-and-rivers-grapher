package no.nav.rapidsandriversgraph

class Graph {
    private var nodes = setOf<Node>()
    fun lesInnHendelse(hendelse: Hendelse) {
        nodes = nodes `merge med` hendelse.toNodes()
    }

    fun tilMermaidGraph() =
            nodes
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