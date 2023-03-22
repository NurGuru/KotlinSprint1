package lesson_7

fun main() {
    var code = (1000..9999).random()
    println("Ваш код авторизации $code")
    println("Введите код авторизации")
    var codeEntered = readln().toInt()

    while (code != codeEntered) {
        code = (1000..9999).random()
        println("Ваш новый код авторизации $code")
        println("Введите корректный код авторизации")
        codeEntered = readln().toInt()
    }
        println("Добро пожаловать!")
    }