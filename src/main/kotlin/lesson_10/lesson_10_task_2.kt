package lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (checkPassword(password)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать")
    }
}

fun checkPassword(password: String): Boolean {
    return password.length < 4
}
