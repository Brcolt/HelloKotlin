package Aquarium

class Aquarium {
    var width: Int = 20
    var heigth: Int = 40
    var lenght: Int = 100

    var volume : Int
        get() = (width * heigth * lenght) / 1000
        set(value) {heigth = (value * 1000) / (width * lenght)}

}
