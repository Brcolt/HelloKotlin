package Funcoes

import java.util.*

fun main(args: Array<String>) {
    var canAddFish = fitMoreFish(currentFish = listOf(2, 2, 2, 2), hasDecoration = true)

    println(canAddFish)
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
var dirty = 20

val walterFilter: (Int) -> Int = { dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(
        dirty,
        walterFilter
    )
    dirty =
        updateDirty(dirty, ::feedFish)
    dirty =
        updateDirty(dirty) { dirty ->
            dirty + 50
        }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
    dirtyProcessor()
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    var food = "fasting"

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pallets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

fun fitMoreFish(
    tankSize: Int = 10,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecoration: Boolean = true
): Boolean {

    var fishCapacity : Int = if(hasDecoration) 8 else 10

    var fishOverflow : Boolean = currentFish.sum() < fishCapacity

    return fishOverflow
}

