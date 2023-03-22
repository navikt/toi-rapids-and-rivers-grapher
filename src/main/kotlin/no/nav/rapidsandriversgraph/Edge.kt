package no.nav.rapidsandriversgraph


sealed interface Edge: Comparable<Edge> {
    fun isEdgeOf(annenNode: Pair<String, String>): Boolean
    fun addEventName(eventName: String)
    fun toMermaidInstruction(): String
}

class ExistingEdge(private val startNode: String, private val endNode: String, eventNames: List<String>): Edge {
    private val eventNames = eventNames.toMutableList()
    override fun isEdgeOf(annenNode: Pair<String, String>) = startNode == annenNode.first && endNode == annenNode.second
    override fun addEventName(eventName: String) {
        eventNames+=eventName
    }

    override fun toMermaidInstruction() = "$startNode --> $endNode;"

    override fun compareTo(other: Edge) = when(other) {
        is ExistingEdge->this.startNode.compareTo(other.startNode)
        is NoEdges-> -1
    }
}

class NoEdges(private val name: String) : Edge {
    override fun isEdgeOf(annenNode: Pair<String, String>) = false
    override fun addEventName(eventName: String) {
        throw IllegalStateException()
    }

    override fun toMermaidInstruction() = "$name;"

    override fun compareTo(other: Edge) = when(other) {
        is ExistingEdge-> 1
        is NoEdges-> name.compareTo(other.name)
    }
}