package lesson_13


class TelephoneBook22(
    val name: String,
    val phone: Long,
    var company: String?
) {
    fun printInfo() {
        val _name = name
        val _phone = phone
        val _company = company ?: "[не указано]"
        println("Имя:$_name\nНомер:$_phone\nКомпания:$_company\n")
    }
}

fun main() {
    val contact1 = TelephoneBook22("Ростислав", 89123456789, null)
    val contact2 = TelephoneBook22("Ростислав", 89123456789, "Tg")
    val contact3 = TelephoneBook22("Ростислав", 89123456789, "VK")
    val list: MutableList<TelephoneBook22> = mutableListOf()

    list.add(contact1)
    list.add(contact2)
    list.add(contact3)

    for (i in list) i.printInfo()
}





