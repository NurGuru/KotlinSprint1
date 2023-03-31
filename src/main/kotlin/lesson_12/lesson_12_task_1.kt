package lesson_12

class WeatherChange() {
    var dayTemperature = 26
    var nightTemperature = 11
    var rain = true
    var atmospherePressure = 123

    fun printWeather() {
        println(dayTemperature)
        println(nightTemperature)
        println(rain)
        println(atmospherePressure)
    }
}

fun main() {
    val weatherYesterday = WeatherChange()
    weatherYesterday.printWeather()
    println()
    val weatherToday = WeatherChange()
    weatherToday.dayTemperature = 34
    weatherToday.nightTemperature = 20
    weatherToday.rain = false
    weatherToday.atmospherePressure = 200
    weatherToday.printWeather()

}