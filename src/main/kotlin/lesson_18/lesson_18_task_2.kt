package lesson_18

open class Dice() {
    open fun diceShot(
        number: Int,
    ) {
        println("Кубик с $number грянями")
    }
}

class SmallDice() : Dice() {
    override fun diceShot(number: Int) {
        println("Брошен кубик с $number гранями. Выпало ${(1..number).random()}")
    }
}

class MediumDice() : Dice() {
    override fun diceShot(number: Int) {
        println("Брошен кубик с $number гранями. Выпало ${(1..number).random()}")
    }
}

class BigDice() : Dice() {
    override fun diceShot(number: Int) {
        println("Брошен кубик с $number гранями. Выпало ${(1..number).random()}")
    }
}

fun main() {
    val smallDice = SmallDice()
    smallDice.diceShot(4)

    val mediumDice = MediumDice()
    mediumDice.diceShot(6)

    val bigDice = BigDice()
    bigDice.diceShot(8)

}