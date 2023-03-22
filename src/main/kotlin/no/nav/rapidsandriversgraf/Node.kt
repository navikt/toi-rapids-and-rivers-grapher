package no.nav.rapidsandriversgraf

class Node private constructor(private val navn: String) {
    private val edges = mutableListOf<Edge>()
    fun addEdgeTo(tilNode: Node, eventName: String) {
        val edge = edges.firstOrNull { it.isEdgeOf(this.navn to tilNode.navn) }
        if(edge==null) edges+=ExistingEdge(this.navn, tilNode.navn, listOf(eventName))
        else edge.addEventName(eventName)
    }

    fun toEdges() = if(edges.isEmpty()) listOf(NoEdges(navn)) else edges

    companion object {
        private val noder = mutableMapOf<RapidServiceNavn, Node>()
        fun fra(rapidServiceNavn: RapidServiceNavn) = noder.computeIfAbsent(rapidServiceNavn) {Node(rapidServiceNavn)}
    }
}

private typealias RapidServiceNavn = String
infix fun Set<Node>.`merge med`(other: Set<Node>): Set<Node> = this + other