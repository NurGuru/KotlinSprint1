package lesson_17

class Cargo(
    private val cargoNumber: Int,
    val firstLocation: String
) {
    var remoovments = 0

    var location = firstLocation
        set(value) {
            field = value
            remoovments++
        }
}

fun main() {
    val cargo1 = Cargo(
        22,
        "Москва"
    )
    println(cargo1.remoovments)
    cargo1.location = "Нальчик"
    println(cargo1.remoovments)
}