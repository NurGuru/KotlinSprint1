package lesson_6

fun main() {
    var firstNumber = (1..9).random()
    var secondNumber = (1..9).random()
    var task = firstNumber + secondNumber
    println("Сколько будет $firstNumber + $secondNumber = ")
    var answer = readln().toInt()
    var attempt = 3

    while (attempt > 1) {
        attempt--
        if (answer != task) {
            firstNumber = (1..9).random()
            secondNumber = (1..9).random()
            task = firstNumber + secondNumber
            println("Неверно! Попробуйте еще раз!\n Сколько будет $firstNumber + $secondNumber = ")
            answer = readln().toInt()
        } else {
            break
        }

    }
    if (answer == task) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}




