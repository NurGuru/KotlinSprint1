package lesson_2

import kotlin.math.pow


fun main() {
    val firstContribution = 70000
    val percent = 16.7
    val timePeriod = 20
    val result: Double = (1 + percent / 100).pow(timePeriod) * firstContribution
//я что-то не смог разобраться, как сделать три знака после запятой
    println(result)
}