package lesson_5

fun main() {
    val userName = "Batman"
    val password = "password"

    println("Введите логин")
    val nameEntered = readln()
    if (nameEntered == userName) {
        println("Введите пароль")
    } else {
        println("Хотите зарегестрироваться?")
    }

    val passwordEntered = readln()
    if (passwordEntered == password) {
        println("Добро пожаловать")
    } else {
        println("Неверный пароль")
    }


}