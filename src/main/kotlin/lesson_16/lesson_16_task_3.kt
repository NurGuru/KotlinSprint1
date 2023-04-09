package lesson_16

class UserLesson16(
    val name: String,
    private val password: String
) {
    fun checkPassword(_password: String) {
        if (password == _password) {
            println("Верный пароль")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = UserLesson16("John", "0707")
    println("Введите пароль")
    val passwordInput = readln()
    user.checkPassword(passwordInput)

}

