package lesson_13

class TelephoneBook1(val name: String, val phone: Long, var company: String? = null) {

    fun printInfo(name: String, phone: Long, company: String?) {

        println("Имя:$name\nНомер:$phone\nКомпания:$company")
    }
}

fun main() {
    val contact = TelephoneBook1("Ростислав", 89123456789, null)

    if (contact.company == null) {
        contact.company = "[не указано]"
    }

    contact.printInfo(contact.name, contact.phone, contact.company)
}