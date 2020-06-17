package Exercicios

fun main(args: Array<String>) {
    val spice = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayanne", "hot"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "mexican")
    )
    val spiceLevel = spice.filter { it.heat > 5 }

    println(spiceLevel.sortedBy { it.heat })

}
