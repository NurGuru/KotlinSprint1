package lesson_11

class Forum() {
    fun createNewUser(id: Int, login: String, password: String, mail: String): User1 {
        return User1(id, login, password, mail)
    }

    fun newMessage(authorId: Int, authorName: String, message: String): String {
        return message
    }

    fun printTread(author: String, message: String) {
        println("$author: $message")
        Thread.sleep(1000)
    }
}

fun main() {
    val creator = Forum()

    val newUser1 = creator.createNewUser(1, "John", "0707", "john@mail.ru")
    val message1FromNewUser1 = creator.newMessage(newUser1.id, newUser1.login, "Hi Jack!")
    val message2FromNewUser1 = creator.newMessage(newUser1.id, newUser1.login, "How are you?")

    val newUser2 = creator.createNewUser(2, "Jack", "0505", "jack@mail.ru")
    val message1FromNewUser2 = creator.newMessage(newUser2.id, newUser2.login, "Hi John!")
    val message2FromNewUser2 = creator.newMessage(newUser2.id, newUser2.login, "I am fine!")

    creator.printTread(newUser1.login, message1FromNewUser1)
    creator.printTread(newUser1.login, message2FromNewUser1)
    creator.printTread(newUser2.login, message1FromNewUser2)
    creator.printTread(newUser2.login, message2FromNewUser2)
}

