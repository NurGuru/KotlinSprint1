package lesson_15

abstract class User(
    val name: String,
    val message: String
) {
    abstract fun readForum()
    abstract fun writeMessage()
}

class CommonUser(
    name: String,
    message: String
) : User(name, message) {
    override fun readForum() {
        println("$name читает форум")
    }

    override fun writeMessage() {
        println("$name написал сообщение: $message")
    }
}

class AdminUser(
    name: String,
    message: String,
    val commonUserName: String
) : User(name, message) {
    override fun readForum() {
        println("$name читает форум")
    }

    override fun writeMessage() {
        println("$name написал сообщение: $message")
    }

    fun deleteMessage() {
        println("Администратор $name удаляет сообщение пользователя $commonUserName")
    }

    fun deleteUser() {
        println("Администратор $name удаляет пользователя $commonUserName")
    }
}

fun main() {
    val user1 = CommonUser("John", "Ваш форум отстой!")
    user1.readForum()
    user1.writeMessage()
    println()
    val admin1 = AdminUser("JackAdmin", "Не нравиться не читай!", user1.name)
    admin1.readForum()
    admin1.writeMessage()
    admin1.deleteUser()
}
