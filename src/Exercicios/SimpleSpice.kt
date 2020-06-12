package Exercicios

class SimpleSpice {
    val spiceName: String = "curry"
    val spiceNivel: String = "mild"
    val heat: Int
        get() {
            return 5
        }

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayanne", "hot"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "mexican")

    )
    init {
        println("Spice: {$spiceName}, Spiceness: ${spiceNivel}")
    }

}
