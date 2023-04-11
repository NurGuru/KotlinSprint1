package lesson_17

class Ship(
    val name: String,
    val speed: Int,
    val port: String
) {
    var shipName: String
        get() = name
        set(value) {
            println("Нельзя менять имя корабля")
        }
}

fun main() {
    val ship = Ship(
        "Титаник",
        22,
        "Порт 47"
    )
    println(ship.shipName)
    ship.shipName = "Корсар"
    println(ship.shipName)
}