package lesson_7

fun main() {
    println("Сколько символов в пароле?")
    val passwordLength = readln().toInt()
    val symbols = (1..9) + ('a'..'z') + ('A'..'Z')

    for (i in passwordLength downTo 1) {
            var password = symbols.random().toString()
            password+=password+symbols
        println(password)
    }


}