package lesson_17

class Game {
    var question: String = "Сколько тебе лет?"
        set(value) {
            field = value
        }
    var answer: String = ""
        get() = "Мне 30 лет"
        set(value) {
            field = value
        }
}

fun main() {
    val game = Game()
    println(game.question)
    println(game.answer)
}