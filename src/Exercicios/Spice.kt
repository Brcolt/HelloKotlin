package Exercicios

class Spice(var name: String, var spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 7
                "hot" -> 9
                "hell" -> 11
                "mexican" -> 13
                else -> 0
            }
        }

    init {
        println("This spice is $name and his have a heat level of $heat")
    }
}

fun makeSalt() = Spice("salt")

fun simpleSpice() = Spice("curry", "mild")
