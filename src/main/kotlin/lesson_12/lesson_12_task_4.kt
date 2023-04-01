package lesson_12

class WeatherChange4(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val rain: Boolean = false,
    val atmospherePressure: Int
) {
    init {
        println(dayTemperature)
        println(nightTemperature)
        println(rain)
        println(atmospherePressure)

    }
}

fun main() {
    val weatherYesterday = WeatherChange4(26, 12, true, 200)
    println()
    val weatherToday = WeatherChange4(35, 20, false, 400)
    println()
    val weatherUsually = WeatherChange4(24, 11, false, 300)
}
