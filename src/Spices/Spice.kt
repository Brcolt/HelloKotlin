package Spices

fun main(ars: Array<String>) {
}

abstract class Spice(var name: String, var spiciness: String, color: SpiceColor): SpiceColor by color {

}

class Curry(name: String, spiciness: String, color: #333333, SpiceColor = YellowSpiceColor): Spice(name, spiceness), Grinder, SpiceColor by color {
    override fun prepareSpice() {
        grind()
}



interface SpiceColor {
    fun color()
}

object YellowSpiceColor {
    override fun color() {
        println("Yellow")
    }
}

fun prepareSpice() {}

