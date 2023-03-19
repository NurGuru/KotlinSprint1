package lesson_4

fun main() {
    var day = 5
    val arms = day % 2 !== 0
    val legs = day % 2 == 0
    val back = day % 2 == 0
    val press = day % 2 !== 0

    println("Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $press")
    println()
    day = 6
    println("Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $press")
}
