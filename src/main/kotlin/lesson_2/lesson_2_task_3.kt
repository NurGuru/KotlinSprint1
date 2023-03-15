package lesson_2

fun main() {
    val startHour = 9
    val startMinute = 39
    val timeInRoad = 457
    val arrivalHour = startHour + (timeInRoad / 60)+(startMinute + timeInRoad % 60)/60
    val arrivalMinute = (startMinute + timeInRoad % 60)%60
    //что-то мне подсказывает, что есть поэелегантней решение, но его его увы не вижу).
    // я и над этим элементарным моментом долго думал)

    println("$arrivalHour:$arrivalMinute")




//    println("$arrivalHour:$arrivalMinute")
}