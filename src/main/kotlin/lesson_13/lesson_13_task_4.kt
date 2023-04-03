package lesson_13

class TelephoneBook2(
    val name: String,
    val phone: Long,
    var company: String?
) {
    fun printInfo() {
        val _name = name
        val _phone = phone
        val _company = company ?: "[не указано]"
        println("Имя:$_name Номер:$_phone Компания:$_company\n")
    }
}

fun main() {
    val contact1 = TelephoneBook2("Ростислав", 89123456789, null)
    val contact2 = TelephoneBook2("Ростислав", 89123456789, "Tg")
    val contact3 = TelephoneBook2("Ростислав", 89123456789, "VK")
    val list: MutableList<TelephoneBook2> = mutableListOf()

    list.add(contact1)
    list.add(contact2)
    list.add(contact3)

    fun addContact() {
        do {
            println("Введите имя нового контакта:")
            val addName: String = readln()
            println("Введите номер телефона нового контакта:")
            val addPhone: Long = readln().toLong()
            println("Введите компанию нового контакта:")
            val addCompany: String = readln()

            if (addPhone != null) {
                list.add(
                    TelephoneBook2(
                        addName,
                        addPhone,
                        addCompany
                    )
                )
            }

            println("Если хотите добавить новую запись, введите \"да\"")
            val askToAdd = readln()

        } while (askToAdd == "да")

        for (i in list) i.printInfo()
    }
    addContact()
}





