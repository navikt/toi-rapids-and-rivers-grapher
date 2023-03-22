package no.nav.rapidsandriversgraph

class Graph {
    private var nodes = setOf<Node>()
    fun lesInnHendelse(hendelse: Hendelse) {
        nodes = nodes `merge med` hendelse.toNodes()
    }

    fun tilMermaidGraph() = (nodeMermaidInstructions() + edgeMermaidInstructions())
        .joinToString(
            separator = "\n",
            prefix = "```mermaid\ngraph TD;\n",
            postfix = "\n```"
        )

    private fun edgeMermaidInstructions() = nodes
        .flatMap(Node::edges)
        .toSortedSet()
        .map(Edge::toMermaidInstruction)

    private fun nodeMermaidInstructions() = nodes
        .filterNot(this::hasEdge)
        .toSortedSet()
        .map(Node::toMermaidInstruction)

    private fun hasEdge(node: Node) = nodes
        .flatMap(Node::edges)
        .any { it.hasNode(node) }

    fun tilMermaidGraphPerEvent(): Map<String, String> {
        TODO("Not yet implemented")
    }
}