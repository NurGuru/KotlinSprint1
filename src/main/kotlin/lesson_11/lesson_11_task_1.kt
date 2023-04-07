package lesson_11

class User1(val id: Int, val login: String, val password: String, val mail: String)

fun main() {
    val userOleg = User1(23, "MrOleg", "oleg0707", "oleg@mail.ru")
    val userSasha = User1(27, "MrSasha", "Sasha0505", "sasha@mail.ru")

    println("Данные Олега: ${userOleg.id}, ${userOleg.login}, ${userOleg.password}, ${userOleg.mail}\n")
    println("Данные Саши: ${userSasha.id}, ${userSasha.login}, ${userSasha.password}, ${userSasha.mail}")
}