package lesson_4

fun main() {
    var day = 5
    val isEven = day % 2 == 0
    val arms = !isEven
    val legs = isEven
    val back = isEven
    val press = !isEven

    println("Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $press")
    println()
    day = 6
    println("Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $press")
}
