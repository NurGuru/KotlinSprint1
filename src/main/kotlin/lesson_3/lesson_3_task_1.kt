package lesson_3

fun main() {
    val user = "John"
    val greeting1 = "Good afternoon"
    val greeting2 = "Good evening"
    var userGreeting ="$greeting1, $user"

    println(userGreeting)
    userGreeting="$greeting2, $user"
    println(userGreeting)
}