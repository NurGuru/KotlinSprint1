package lesson_11

class RelativesAndFriends(val status: String, val name: String)

class Contact(
    val firstName: String,
    val secondName: String,
    val mobilePhone: Long,
    val homePhone: Long,
    val mail: String,
    val favoriteContacts: List<RelativesAndFriends>,
) {
    fun writeMessage() {
        println("Написать сообщение")
        val message = readln()
    }

    fun makeCall(firstName: String, secondName: String) {
        println("Вы звоните $firstName $secondName")
    }

    fun makeVideoCall(firstName: String, secondName: String) {
        println("Вы звоните по видео $firstName $secondName")
    }

    fun writeOnMail(mail: String) {
        println("Написать на почту $mail")
    }

}

fun main() {
    val contact1 = Contact(
        "First Name",
        "Second Name",
        89999994242,
        89998884242,
        "mail@mail.ru",
        listOf(
            RelativesAndFriends("жена", "Username"),
            RelativesAndFriends("подруга", "Username"),
            RelativesAndFriends("жена", "Username"),
        )
    )
}