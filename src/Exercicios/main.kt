package Exercicios

fun main(args: Array<String>){
    val simpleSpice = SimpleSpice()
    val spice1 = Spice(name = "Pepper", spiciness = "hot")
    val spiceList = spice1.filter { it.heat < 5}

    println(spice1)
}
