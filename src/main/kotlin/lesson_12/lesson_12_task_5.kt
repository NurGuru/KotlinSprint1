package lesson_12

import kotlin.random.Random

class WeatherChange5(
    var dayTemperature: Int,
    val nightTemperature: Int,
    val rain: Boolean,
    val atmospherePressure: Int
)

fun main() {
    var middleDayTemperature = 0
    var middleNightTemperature = 0
    var middleAtmosphere = 0
    var rainyDays = 0
    val list: MutableList<WeatherChange5> = mutableListOf()

    for (i in 1..10) {
        val newDay = WeatherChange5(
            dayTemperature = (10..36).random(),
            nightTemperature = (5..15).random(),
            rain = Random.nextBoolean(),
            atmospherePressure = (600..800).random()
        )
        list.add(newDay)
    }
    list.forEach {
        middleDayTemperature += (it.dayTemperature) / 10
        middleNightTemperature += (it.nightTemperature) / 10
        middleAtmosphere += (it.atmospherePressure) / 10
        if (it.rain) rainyDays += +1
    }


    for (i in list) {
        if (i.rain) rainyDays += +1
    }

    println(middleDayTemperature)
    println(middleNightTemperature)
    println(middleAtmosphere)
    println(rainyDays)
}



