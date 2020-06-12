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

    val smallAquarium = Aquarium(numberOfFish = 10)

    println(myAquarium.volume)
    println("My small aquarium: \n" +
            "length: ${smallAquarium.lenght} \n" +
            "height: ${smallAquarium.heigth} \n" +
            "width: ${smallAquarium.width}")

}
