package lesson_11


class Forum() {
    var mainId: Int=0
    var messages: MutableList<NewMessage> = mutableListOf()

    fun createNewUser(login: String, password: String, mail: String): User5 {
        mainId+=+1
        return User5(mainId, login, password, mail)

    }

    fun newMessage(authorId: Int, authorName: String, message: String): NewMessage {

        return NewMessage(authorId, authorName, message)
    }

    fun printTread() {

        for (i in messages) {
            var messageAuthorName= messages[1]
            var messageText= messages[2]
            println("$messageAuthorName: $messageText")
            Thread.sleep(1000)
        }
//
    }
}

class User5(val id: Int, val login: String, val password: String, val mail: String)
class NewMessage(authorId: Int, authorName: String, message: String)

fun main() {
    val creator = Forum()

    val newUser1 = creator.createNewUser("John", "0707", "john@mail.ru")
    val message1FromNewUser1 = creator.newMessage(newUser1.id, newUser1.login, "Hi Jack!")
    val message2FromNewUser1 = creator.newMessage(newUser1.id, newUser1.login, "How are you?")


    val newUser2 = creator.createNewUser("Jack", "0505", "jack@mail.ru")
    val message1FromNewUser2 = creator.newMessage(newUser2.id, newUser2.login, "Hi John!")
    val message2FromNewUser2 = creator.newMessage(newUser2.id, newUser2.login, "I am fine!")

    creator.messages.addAll(
        listOf(
            message2FromNewUser1,
            message2FromNewUser1,
            message1FromNewUser2,
            message2FromNewUser2
        )
    )



    creator.printTread()

}

