package lesson_7

fun main() {
    println("Сколько символов в пароле?")
    val passwordLength = readln().toInt()
    val number = (1..9)
    val letter = ('a'..'z')
    val letterUp = ('A'..'Z')

        for (i in passwordLength downTo 1) {
        var symbol = ((number + letter + letterUp).random()).toString()
        symbol+=symbol
        println(symbol)
    }


}