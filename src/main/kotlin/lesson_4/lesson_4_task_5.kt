package lesson_4

fun main() {
    val breaks = readln().toBoolean()
    val teammates = readln().toInt()
    val foodBoxes = readln().toInt()
    val goodWeather = readln().toBoolean()
    val conditionWithNoBreaks = !breaks && teammates >= 55 && teammates < 70 && foodBoxes > MIN_FOOD_BOXES
    val conditionWithSmallBreaks = breaks && teammates == 70 && foodBoxes > MIN_FOOD_BOXES && goodWeather == true
    val mayGo = conditionWithNoBreaks || conditionWithSmallBreaks

    println("Можно отправляться? - $mayGo")
}

const val MIN_TEAMMATES = 55
const val MAX_TEAMMATES = 70
const val MIN_FOOD_BOXES = 50
