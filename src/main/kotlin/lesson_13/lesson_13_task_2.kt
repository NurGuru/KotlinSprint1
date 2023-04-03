package lesson_13

class TelephoneBook1(val name: String, val phone: Long, var company: String? = null) {

    fun printInfo() {
        val _name = name
        val _phone = phone
        val _company = company ?: "[не указано]"

        println("Имя:$_name\nНомер:$_phone\nКомпания:$_company")
    }
}

fun main() {
    val contact = TelephoneBook1("Ростислав", 89123456789, null)

    contact.printInfo()
}