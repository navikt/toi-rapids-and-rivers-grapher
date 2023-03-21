package no.nav.rapidsandriversgrapher

class Node(private val navn: String) {
    private val borderNodesPerEventName = mutableMapOf<String, List<Node>>()
    fun pathTo(besøker: Node, eventName: String) {
        borderNodesPerEventName.compute(eventName) { _, noder ->
            if(noder == null) listOf(besøker) else noder+besøker
        }
    }

    fun toMermaid() = if(borderNodesPerEventName.isEmpty()) "$navn;" else borderNodesPerEventName
        .flatMap { it.value }
        .distinct()
        .joinToString("\n") { "$navn --> ${it.navn};" }

    companion object {
        private val noder = mutableMapOf<String, Node>()
        fun fra(besøktService: String) = noder.computeIfAbsent(besøktService) {Node(besøktService)}
    }

}
infix fun Set<Node>.`merge med`(other: Set<Node>) = this + other