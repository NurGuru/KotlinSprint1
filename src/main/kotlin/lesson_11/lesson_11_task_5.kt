package lesson_11

fun main() {
    val creator = Forum()
    val newUser1 = creator.newUser("John", "0707", "john@mail.ru")
    val newUser2 = creator.newUser("Jack", "0505", "jack@mail.ru")

    creator.newMessage(newUser1.id, "Hello, Jack!")
    creator.newMessage(newUser2.id, "Hi, John!")
    creator.newMessage(newUser1.id, "How are you?")
    creator.newMessage(newUser2.id, "I am fine!")

    creator.printThread()
}

class User5(
    val id: Int,
    val userName: String,
    val password: String,
    val email: String,
)

class Message(
    val id: Int,
    val author: User5?,
    val text: String,
)

class Forum(
    private var messageId: Int = 0,
    private var userId: Int = 0,
    private val authors: MutableList<User5> = mutableListOf(),
    private val messages: MutableList<Message> = mutableListOf(),
) {
    fun newUser(username: String, password: String, email: String): User5 {
        val user = User5(
            id = userId,
            userName = username,
            password = password,
            email = email,
        )
        authors.add(user)
        userId++
        return user
    }

    fun newMessage(authorId: Int, text: String) {
        val user = authors.find { it.id == authorId }
        val message = Message(id = messageId, author = user, text = text)
        messages.add(message)
        messageId++
    }

    fun printThread() {
        messages.forEach {
            println("${it.author?.userName}: ${it.text}")
        }
    }
}