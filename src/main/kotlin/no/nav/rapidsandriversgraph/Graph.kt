package no.nav.rapidsandriversgraph

class Graph {
    private var nodes = setOf<Node>()
    fun lesInnEvent(event: Event) {
        nodes = nodes `merge med` event.toNodes()
    }

    fun tilMermaidGraph() = (nodeMermaidTextDefinition() + edgeMermaidTextDefinition())
        .joinToString(
            separator = "\n",
            prefix = "```mermaid\ngraph TD;\n",
            postfix = "\n```"
        )

    private fun edgeMermaidTextDefinition() = nodes
        .flatMap(Node::edges)
        .toSortedSet()
        .map(Edge::toMermaidTextDefinition)

    private fun nodeMermaidTextDefinition() = nodes
        .filterNot(this::hasEdge)
        .toSortedSet()
        .map(Node::toMermaidTextDefinition)

    private fun hasEdge(node: Node) = nodes
        .flatMap(Node::edges)
        .any { it.hasNode(node) }

    fun tilMermaidGraphPerEvent(): Map<String, String> {
        TODO("Not yet implemented")
    }
}