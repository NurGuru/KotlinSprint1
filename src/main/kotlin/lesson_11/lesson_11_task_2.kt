package lesson_11

class User2(val id: Int, val login: String, var password: String, val mail: String, var bio: String = "") {
    fun printUserInfo(user: User2) {
        println("${user.id} ${user.login} ${user.password} ${user.mail}")
    }

    fun addBio() {
        println("Расскажите о себе")
        bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль")
        val oldPassword = readln()
        if (oldPassword == password) {
            println("Введите новый пароль")
            password = readln()
            println("Ваш новый пароль: $password")
        } else {
            println("Введен неверный пароль!!!")
        }
    }
    fun sendMessage(message: String) {
        println(message)
    }
}

fun main() {

    val userDave = User2(7, "MrDave", "dave0707", "dave@mail.ru")

    userDave.printUserInfo(userDave)
    println()
    userDave.addBio()
    println()
    userDave.changePassword()
    println()
    println("Какое сообщение отправить пользователю??")
    val message = readln()
    userDave.sendMessage(message)
}
