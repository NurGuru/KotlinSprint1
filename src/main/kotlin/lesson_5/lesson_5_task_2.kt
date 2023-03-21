package lesson_5

fun main() {
    val birthYear = readln().toInt()
    val nowYear = 2023
    val userAge = nowYear - birthYear

    if (userAge>= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }


}

const val AGE_OF_MAJORITY = 18