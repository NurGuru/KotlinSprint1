package lesson_12

class WeatherChange2(_dayTemperature: Int, _nightTemperature: Int, _rain: Boolean, _atmospherePressure: Int) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var rain = _rain
    var atmospherePressure = _atmospherePressure

    fun printWeather() {
        println(dayTemperature)
        println(nightTemperature)
        println(rain)
        println(atmospherePressure)
    }
}

fun main() {
    val weatherYesterday = WeatherChange2(26, 12, true, 200)
    weatherYesterday.printWeather()
    println()
    val weatherToday = WeatherChange2(35, 20, false, 400)
    weatherToday.printWeather()
    println()
    val weatherUsually = WeatherChange2(24, 11, false, 300)
    weatherUsually.printWeather()

}