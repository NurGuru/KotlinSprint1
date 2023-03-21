package lesson_6

fun main() {
    println("Создайте логин")
    val regLogin = readln()
    println("Создайте пароль")
    val regPassword = readln()

    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    var password = readln()
    if (password == regPassword) {
        println("Авторизация прошла успешно.")
    } else {
        println("Введен неверный пароль")
        while (password != regPassword) {
            println("Введите пароль заново")
            password = readln()
        }
    }
}
