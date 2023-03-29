package lesson_11

class Contact(
    val firstName: String,
    val secondName: String,
    val mobilePhone: Long, homePhone: Long,
    val mail: String,
    val favoriteContacts: List<String>,
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
        favoriteContacts = listOf("жена", "подруга", "подруга")
    )
}