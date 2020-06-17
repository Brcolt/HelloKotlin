package Aquarium

import kotlin.math.PI

open class Aquarium(var width: Int = 20, var heigth: Int = 40, var lenght: Int = 100 ) {

    open var volume : Int
        get() = (width * heigth * lenght) / 1000
        set(value) {heigth = (value * 1000) / (width * lenght)}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water : Int = numberOfFish * 2000
        val tank : Double = water * water * 0.1
        heigth = (tank / (lenght * width)).toInt()
    }

}

class TowerTank(): Aquarium() {

    override var water = volume * 0.8

    override var volume : Int
        get() = (width * heigth * PI).toInt() / 1000
        set(value) {
            heigth = (value * 1000) / (width * lenght)}


}
