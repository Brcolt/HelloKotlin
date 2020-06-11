package Aquarium

fun main (args: Array<String>) {
    buildAquarium()
}
fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Lenght: ${myAquarium.lenght} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.heigth} "
    )

    println(myAquarium.volume)
}
