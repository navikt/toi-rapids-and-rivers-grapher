package no.nav.rapidsandriversgrapher

class Node(private val navn: String) {
    private val edges = mutableListOf<Edge>()
    fun pathTo(besøker: Node, eventName: String) {
        val edge = edges.firstOrNull { it.isEdgeOf(this.navn to besøker.navn) }
        if(edge==null) edges+=ExistingEdge(this.navn, besøker.navn, listOf(eventName))
        else edge.addEventName(eventName)
    }

    fun toEdges() = if(edges.isEmpty()) listOf(NoEdges(navn)) else edges

    companion object {
        private val noder = mutableMapOf<String, Node>()
        fun fra(besøktService: String) = noder.computeIfAbsent(besøktService) {Node(besøktService)}
    }
}
infix fun Set<Node>.`merge med`(other: Set<Node>) = this + other