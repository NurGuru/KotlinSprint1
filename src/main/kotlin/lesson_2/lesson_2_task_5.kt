package lesson_2

import kotlin.math.pow


fun main() {
    val firstContribution = 70000
    val percent = 16.7
    val timePeriod = 20
    val result = (1 + percent / 100).pow(timePeriod) * firstContribution
    val formatted = String.format("%.3f", result)

    println(result)
    println(formatted)
}