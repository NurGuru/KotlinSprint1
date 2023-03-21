package lesson_5

fun main() {
    val task = 2 + 2
    println("Сколько будет 2 + 2 = ")
    val answer = readln().toInt()

    if (answer == task) {
        println("Добро пожаловать!")
    } else {
        println( "Доступ запрещен.")
    }

}