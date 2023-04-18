package lesson_17


class User17(
    val login: String,
    private val password: String
) {

    var userPassword = password
        set(value) = println("Вы не можете поменять пароль!")
        get() = "*".repeat(field.length)


    var userLogin = login
        set(value) {
            field = value
            println("Логин успешно изменен!")
        }
}

fun main() {
    val user = User17("John", "0707")
    user.userPassword = "00505"
    println(user.userPassword)

    user.userLogin = "Jack"
    println(user.userLogin)
}

