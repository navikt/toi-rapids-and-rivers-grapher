package no.nav.rapidsandriversgraph

class Graph {
    private var nodes = setOf<Node>()

    private var eventNames = setOf<String>()

    fun lesInnEvent(event: Event) {
        nodes = nodes + event.toNodes()
        eventNames = event + eventNames
    }

    fun tilMermaidGraph(eventName: String = "") =
        (nodeMermaidTextDefinition() + edgeMermaidTextDefinition(eventName))
            .joinToString(
                separator = "\n",
                prefix = "graph TD;\n"
            )

    private fun edgeMermaidTextDefinition(eventName: String) =
        sortedEdges()
            .map { it.toMermaidTextDefinition(eventName) }

    private fun sortedEdges() = nodes
        .flatMap(Node::edges)
        .toSortedSet()

    private fun nodeMermaidTextDefinition() = nodes
        .filterNot(this::hasEdge)
        .toSortedSet()
        .map(Node::toMermaidTextDefinition)

    private fun hasEdge(node: Node) = nodes
        .flatMap(Node::edges)
        .any { it.hasNode(node) }

    fun tilMermaidGraphPerEvent(): Map<String, String> = eventNames.sorted().associateWith(::tilMermaidGraphForEvent)

    private fun tilMermaidGraphForEvent(eventName: String): String {

        return (nodeMermaidTextDefinition() + edgeMermaidTextDefinition(eventName))
            .joinToString(
                separator = "\n",
                prefix = "graph TD;\n",
                postfix = leggPåFarger(eventName)
            )
    }

    private fun leggPåFarger(eventName: String) =
        if (eventHarEdge(eventName)) sortedEdges()
            .mapIndexed { index, edge ->
                edge to index
            }.filter { it.first.hasEvent(eventName) }
            .toMap()
            .values
            .joinToString(",")
            .let { "\n\nlinkStyle $it stroke:red;\nclassDef x stroke: red;" }
        else ""

    private fun eventHarEdge(eventName: String) = sortedEdges().any { it.hasEvent(eventName) }
}