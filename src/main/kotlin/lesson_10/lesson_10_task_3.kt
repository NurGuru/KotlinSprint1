package lesson_10

fun main() {
    println("Введите длину пароля")
    val passwordLength = readln().toInt()
    createPassword(passwordLength)

}

fun createPassword(length: Int) {
    val symbols = (1..9)+( " \" # \$ % & ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \\ ] ^ _ `   ~").split(" ")
    var password = ""
    for (i in 1..length) {
        password += symbols.random()
    }
    println(password)
}