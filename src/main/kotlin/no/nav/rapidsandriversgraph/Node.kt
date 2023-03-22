package no.nav.rapidsandriversgraph

class Node private constructor(private val navn: String): Comparable<Node> {
    private val mutableEdges = mutableListOf<Edge>()
    val edges: List<Edge>
        get() = mutableEdges.toList()

    fun addEdgeTo(tilNode: Node, eventName: String) {
        val edge = mutableEdges.firstOrNull { it.isEdgeOf(this to tilNode) }
        if (edge == null) mutableEdges += Edge(this, tilNode, listOf(eventName))
        else edge.addEventName(eventName)
    }

    fun toMermaidTextDefinition() = "$navn;"
    override fun toString() = navn

    companion object {
        private val noder = mutableMapOf<RapidServiceNavn, Node>()
        fun fra(rapidServiceNavn: RapidServiceNavn) = noder.computeIfAbsent(rapidServiceNavn) { Node(rapidServiceNavn) }
    }

    override fun compareTo(other: Node) = navn.compareTo(other.navn)
}

private typealias RapidServiceNavn = String

infix fun Set<Node>.`merge med`(other: Set<Node>): Set<Node> = this + other