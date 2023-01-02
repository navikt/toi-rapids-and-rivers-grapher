package no.nav.rapidsandriversgrapher

class Node(private val navn: String) {
    private val borderNodes = mutableSetOf<Node>()
    fun pathTo(besøker: Node) {
        borderNodes+=besøker
    }

    fun toMermaid() = if(borderNodes.isEmpty()) "$navn;" else borderNodes.joinToString("\n") { "$navn --> ${it.navn};" }

    companion object {
        private val noder = mutableMapOf<String, Node>()
        fun fra(besøktService: String) = noder.computeIfAbsent(besøktService) {Node(besøktService)}
    }

}
infix fun Set<Node>.`merge med`(other: Set<Node>) = this + other