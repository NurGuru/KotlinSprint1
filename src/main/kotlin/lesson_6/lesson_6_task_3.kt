package lesson_6

fun main() {
    println("Сколько засечь секунд:")
    var counter = readln().toInt()

    while (counter > 0) {
        println("Осталось ${counter--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}