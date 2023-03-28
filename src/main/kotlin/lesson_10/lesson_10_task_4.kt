package lesson_10

fun main() {
    var humanWins = 0
    do {
        println("Бросок человека")
        val humanShot = makeShot()
        println("Бросок компьютера")
        val machineShot = makeShot()

        if (humanShot > machineShot) {
            println("Победило человечество!!!")
            println()
            humanWins += +1
        } else {
            println("Победила машина!!!")
            println()
        }
    } while (newRound(humanWins) == "да")

}

fun makeShot(): Int {
    val shot1 = (1..6).random()
    val shot2 = (1..6).random()
    val shotSum = shot1 + shot2
    println("$shot1 и $shot2")
    return shotSum

}

fun newRound(humanWinss: Int): String {
    println("Хотите бросить еще раз?")
    val answer = readln()
    if (answer != "да") {
        println("Вы выйграли $humanWinss раз")
    }
    return answer

}
