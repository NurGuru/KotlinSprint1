package lesson_12

class WeatherChange3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val rain: Boolean = false,
    val atmospherePressure: Int
) {

    fun printWeather() {
        println(dayTemperature)
        println(nightTemperature)
        println(rain)
        println(atmospherePressure)
    }
}

fun main() {
    val weatherYesterday = WeatherChange3(26, 12, true, 200)
    weatherYesterday.printWeather()
    println()
    val weatherToday = WeatherChange3(35, 20, false, 400)
    weatherToday.printWeather()
    println()
    val weatherUsually = WeatherChange3(24, 11, false, 300)
    weatherUsually.printWeather()
}
