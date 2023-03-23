package lesson_8

fun main() {
    val arrayOfDays = intArrayOf(14, 34, 44, 23, 22, 12, 34)
    var viewsInAWeek = 0

    for (i in arrayOfDays) {
        viewsInAWeek += i
    }
    println(viewsInAWeek)
}