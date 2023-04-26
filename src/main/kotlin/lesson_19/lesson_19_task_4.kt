package lesson_19

enum class Patron {
    BLUE,
    GREEN,
    RED,
}

class Tank {

    private var currentPatron: Patron? = null

    fun changePatron(patron: Patron) {

        currentPatron = patron
    }

    fun shoot() {
        when (currentPatron) {
            Patron.BLUE -> println("Выстрел синими патроном (5 ед. урона)")
            Patron.GREEN -> println("Выстрел зелеными патроном (10 ед. урона)")
            Patron.RED -> println("Выстрел красными патроном (20 ед. урона)")
            else -> println("Орудие не заряжено")
        }
    }
}

fun main() {
    val tank = Tank()
    tank.changePatron(Patron.RED)
    tank.shoot()

    tank.changePatron(Patron.GREEN)
    tank.shoot()

    tank.changePatron(Patron.BLUE)
    tank.shoot()
}