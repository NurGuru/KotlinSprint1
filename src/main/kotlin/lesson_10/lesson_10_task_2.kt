package lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (validate(password.length)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать")
    }
}

fun validate(passwordLength: Int): Boolean {
    return passwordLength <= 4
}