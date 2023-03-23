package lesson_7

fun main() {
    do {

        val code = (1000..9999).random()
        println("Ваш код авторизации $code")
        println("Введите код авторизации")
        val codeEntered = readln().toInt()
    } while (code != codeEntered)

    println("Добро пожаловать!")
}