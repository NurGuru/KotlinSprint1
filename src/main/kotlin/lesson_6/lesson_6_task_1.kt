package lesson_6

fun main() {
    println("Создайте логин")
    val regLogin = readln()
    println("Создайте пароль")
    val regPassword = readln()

    do {
        println("Введите логин")
        val login = readln()
        println("Введите пароль")
        val password = readln()
    } while (password != regPassword)

    println("Авторизация прошла успешно.")
}
