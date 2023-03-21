package lesson_6

fun main() {
    val winNumber = (1..9).random()
    var shot = 5
    val gess = winNumber

    while (shot != gess && shot > 0) {
        shot--
        readln().toInt()
    }
    if (shot == gess) {
        println("Это была великолепная игра")
    } else {
        println("Было загадано число $gess")
    }


}