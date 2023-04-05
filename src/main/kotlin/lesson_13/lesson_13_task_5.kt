package lesson_13

import java.lang.NumberFormatException

fun main() {
    val number: Long
    val strNumber = readLine().toString()

    try {
        number = strNumber.toLong()
    } catch (e: NumberFormatException){
        println("Введите коректный номер")
    }
}