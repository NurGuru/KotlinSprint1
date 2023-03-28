package lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (validation(password.length)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать")
    }
}

fun validation(passwordLength: Int): Boolean {
    return passwordLength <= 4
}