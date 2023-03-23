package lesson_6

fun main() {
    val winNumber = (1..9).random()
    var shot = 5

    println("Попробуй угадать число!")
    while (shot > 0) {
        shot--
        val tryNumber = readln().toInt()
        if (tryNumber != winNumber) {
            println("Попробуй еще раз!")
        }
        if (tryNumber == winNumber) {
            println("Это была великолепная игра")
            break
        }
    }
    println("Было загадано число $winNumber")
}