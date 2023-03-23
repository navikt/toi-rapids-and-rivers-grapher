package no.nav.rapidsandriversgraph

class Graph {
    private var nodes = setOf<Node>()

    private var eventNames = setOf<String>()

    fun lesInnEvent(event: Event) {
        if(!event.skipEvent()) {
            nodes = nodes + event.toNodes()
            eventNames = event + eventNames
        }
    }

    fun tilMermaidGraph(eventName: String = "") =
        (nodeMermaidTextDefinition() + edgeMermaidTextDefinition(eventName))
        .joinToString(
            separator = "\n",
            prefix = "```mermaid\ngraph TD;\n",
            postfix = "\n```"
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

    fun tilMermaidGraphPerEvent(): Map<String, String> =
        eventNames.map { eventName ->


            val start = (nodeMermaidTextDefinition() + edgeMermaidTextDefinition(eventName))
                .joinToString(
                    separator = "\n",
                    prefix = "```mermaid\n---\ntitle: $eventName\n---\ngraph TD;\n",
                    postfix = ""
                )






            val midten = sortedEdges()
                .mapIndexed { index, d ->
                    d to "linkStyle $index stroke:red;"
                }.filter { it.first.hasEvent(eventName) }
                .map(Pair<Edge, String>::second)

            val harEdge = sortedEdges().any { it.hasEvent(eventName) }
            val slutt = (if(harEdge) "\nclassDef x stroke: red;" else "")  + "\n```"

            val verdi = midten.joinToString(separator = "\n", prefix = "$start\n\n", postfix = slutt)

            eventName to verdi
        }.toMap()

}