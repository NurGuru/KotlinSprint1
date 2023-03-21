package lesson_6

fun main() {
    println("Сколько засечь секунд:")
    var counter = readln().toInt()
    val seconds = counter

    while (counter > 0) {
        counter--
        Thread.sleep(1000)
    }
    println("прошло $seconds секунд/ы")
}