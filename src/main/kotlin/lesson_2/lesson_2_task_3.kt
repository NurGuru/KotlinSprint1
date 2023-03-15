package lesson_2

fun main() {
    val startlHour = 9
    val startMinute = 39
    val timeInRoad = 457
    var arrivalHour =startlHour +(timeInRoad/60)
    var arrivalMinute =startMinute +(timeInRoad%60)
    if (arrivalMinute>60) {
        arrivalHour = arrivalHour+1
        arrivalMinute = arrivalMinute - 60
    }
//я не знал, как по другому сделать, чтоб минуты в час первести))
    println("$arrivalHour:$arrivalMinute")
}