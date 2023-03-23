package no.nav.rapidsandriversgraph


class Edge(private val startNode: Node, private val endNode: Node, eventNames: Set<String>): Comparable<Edge> {
    private val eventNames = eventNames.toMutableSet()
    fun isEdgeOf(annenNode: Pair<Node, Node>) = startNode == annenNode.first && endNode == annenNode.second
    fun addEventName(eventName: String) {
        eventNames+=eventName
    }

    fun toMermaidTextDefinition(eventName: String) = if(hasEvent(eventName)) "$startNode:::x --> $endNode:::x;" else "$startNode --> $endNode;"

    override fun compareTo(other: Edge) = startNode.compareTo(other.startNode).let {
        if(it!=0) it else endNode.compareTo(other.endNode)
    }
    fun hasNode(node: Node) = startNode == node || endNode == node

    fun hasEvent(event: String) = event in eventNames
}