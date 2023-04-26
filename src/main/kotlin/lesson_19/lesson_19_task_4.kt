package lesson_19

enum class Gender {
    MALE,
    FEMALE,
}

class Person(
    val name: String,
    val gender: Gender,
)

fun main() {
    val file: MutableList<Person> = mutableListOf()

    println("Заполните файл пятью пользователями. Введите имя и гендер(male/female)")
    repeat(5) {

        println("Введите пользователя №${it + 1}")

        val getName = readln()
        val getGender = readln()
        val newPerson = Person(getName, Gender.valueOf(getGender.uppercase()))
        file.add(newPerson)

    }

    file.forEach { println("${it.name}, ${it.gender}") }
}
