package lesson_14

open class StandartShip1(
    val name: String, val type: String, val speed: Int, val loadAbility: Int, var aceBrake: Boolean = false
) {
    fun printShipSpeed() {
        println("Скорость корабля $name: $speed")
    }

    fun printSheepLoadAbility() {
        println("Вмсетительность корабля $name: $loadAbility ящиков")
    }

    fun printAceBreakAbility() {
        println("Может ломать лед: $aceBrake")
    }
}

class CargoShip(val carryHeavyStuff: Boolean) : StandartShip1(
    "Грузчик",
    "Грузовой Корабль",
    20,
    1000
)

class AceBreaker(val canUseInWar: Boolean) : StandartShip1(
    "Ледокол",
    "Корабль ледокол",
    20,
    1000
) {
    fun makeShipAceBreaker() {
        aceBrake = true

    }
}

fun main() {
    val aceBreaker = AceBreaker(true)
    val cargoShip = CargoShip(true)

    println(aceBreaker.name)
    aceBreaker.printShipSpeed()
    aceBreaker.printSheepLoadAbility()
    aceBreaker.makeShipAceBreaker()
    aceBreaker.printAceBreakAbility()
    println()
    println(cargoShip.name)
    cargoShip.printShipSpeed()
    cargoShip.printSheepLoadAbility()

}

