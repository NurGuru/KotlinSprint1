package lesson_4

fun main() {
    val weather = "солнечная погода"
    val tent: Boolean = true
    val humidity = 20
    val season = "winter"
    val suitableDay = weather == "солнечная погода" && tent == true && humidity == 20 && season != "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? $suitableDay")
}
