package lesson_10

fun main() {
    println("Бросок человека")
    val humanShot = makeShot()
    println("Бросок компьютера")
    val machineShot = makeShot()
    println()
    if (humanShot > machineShot) {
        println("Победило человечество")
    } else {
        println("Победила машина")
    }
}

fun makeShot(): Int {
    val shot1 = (1..6).random()
    val shot2 = (1..6).random()
    val shotSum = shot1 + shot2
    println("$shot1 и $shot2")
    return shotSum

}