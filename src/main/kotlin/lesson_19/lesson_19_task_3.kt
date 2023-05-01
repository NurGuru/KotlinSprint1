package lesson_19

class SpaceShip(
    val name: String,
) {

    fun takeOff() {
        // TODO добавить реализацию взлета
    }

    fun landOn() {
        println("Прописать дополнительную логику")
    }

    fun shoot(): String {
        TODO()
    }
}

fun main() {
    val spaceShip = SpaceShip("Astra")
    spaceShip.landOn()
}