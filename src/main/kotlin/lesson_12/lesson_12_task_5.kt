package lesson_12

import kotlin.random.Random

class WeatherChange5(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val rain: Boolean,
    val atmospherePressure: Int
) {

}

fun main() {

//    val randomValues = WeatherChange5(
//            dayTemperature = (10..36).random(),
//            nightTemperature = (-5..15).random(),
//            rain = Random.nextBoolean(),
//            atmospherePressure = (600..800).random()
//        )
    val list = mutableListOf<WeatherChange5>()
    for (i in 0..10) {
        list.add(
            WeatherChange5(
                dayTemperature = (10..36).random(),
                nightTemperature = (-5..15).random(),
                rain = Random.nextBoolean(),
                atmospherePressure = (600..800).random())
        )
        println(list)
    }



}


//init {
//        println(dayTemperature)
//        println(nightTemperature)
//        println(rain)
//        println(atmospherePressure)
//
//    }


//val weatherYesterday = WeatherChange5(26, 12, true, 200)
//    println()
//    val weatherToday = WeatherChange5(35, 20, false, 400)
//    println()
//    val weatherUsually = WeatherChange5(24, 11, false, 300)