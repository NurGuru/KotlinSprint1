package lesson_7

fun main() {
    println("Сколько символов в пароле?")
    val passwordLength = readln().toInt()
    val symbols = (1..9) + ('a'..'z') + ('A'..'Z')
    var password = ""

    for (i in passwordLength downTo 1) {
            password+=symbols.random()
    }
    println(password)


}