package lesson_16

class GameStone(private val number: Int = (1..6).random()) {

    fun showNumber() {
        println("Выпало число $number")
    }
}

fun main() {
    val stone = GameStone()
    stone.showNumber()
}