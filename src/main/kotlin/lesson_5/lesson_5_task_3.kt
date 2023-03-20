package lesson_5

fun main() {

    val winNumber1 = 5
    val winNumber2 = 33
    println("Введите два числа от 1 до 100")
    val usersTry1 = readln().toInt()
    val usersTry2 = readln().toInt()

    if (usersTry1 == winNumber1 && usersTry2 == winNumber2 || usersTry1 == winNumber2 && usersTry2 == winNumber1) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (usersTry1 == winNumber1 || usersTry1 == winNumber2 || usersTry2 == winNumber1 || usersTry2 == winNumber2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")

    }
}
