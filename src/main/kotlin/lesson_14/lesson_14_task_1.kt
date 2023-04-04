package lesson_14

class StandartShip(
    val name: String,
    val type: String,
    val speed: Int,
    val loadAbility: Int,
    val aceBrake: Boolean = false
) {
    fun printShipSpeed() {
        println("Скорость корабля $name: $speed")
    }

    fun printSheepLoadAbility() {
        println("Вмсетительность корабля $name: $loadAbility ящиков")
    }
}

fun main() {
    val standartShip = StandartShip(
        "Корабль",
        "Стандартный  корабль",
        50,
        500
    )
    standartShip.printShipSpeed()
    standartShip.printSheepLoadAbility()
}