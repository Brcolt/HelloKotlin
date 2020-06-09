fun main(args: Array<String>) {
//    var fortune: String
//    var birthDay = getBirthDay()
    println(whatShouldIDoToday("happy"))
//    for(i in 1..10) {
//        fortune = getFortuneCookie(birthDay)
//        println("\n Your fortune is $fortune")
//        if(fortune.contains("Take it easy")) break
//    }

}


fun getFortuneCookie(birthDay: Int): String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val index = when(birthDay) {
        in 1..7 -> 4
        28, 31 -> 2
    else -> birthDay.rem(fortunes.size)
    }

    return fortunes[index]


}

fun getBirthDay() : Int {
    print("Enter your Birth Day: ")
    var birthDay = readLine()?.toIntOrNull() ?: 1
    return birthDay
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "Sunny",
    temperature: Int = 24
) : String {

    return when {
        mood == "happy" && weather == "Sunny" -> "Go for walk"
        else -> "Stay home and read"
    }
}

