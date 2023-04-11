package lesson_16

class Player(
    val name: String,
    private var health: Int,
    var punchStrength: Int,
) {


    fun takeDamage(takingDamageStrength: Int) {
        println("Нанесено $takingDamageStrength урона здоровью ")
        health -= takingDamageStrength
        if (health > 0) println("Ваше здоровье = $health")
        else death()
    }

    private fun death() {
        punchStrength = 0
        health = 0
        println("Потрачено!")
    }

    fun healingSlave(heal: Int) {
        if (health > 0) {
            println("Востановлено $heal очков здоровья")
            health += heal
            println("Ваше здоровье = $health")
        } else {
            println("Вы мертвы и не можете лечиться(")
        }
    }
}

fun main() {
    val player1 = Player("John", 100, 20)
    player1.takeDamage(90)
    player1.healingSlave(30)
    player1.takeDamage(60)
    player1.healingSlave(10)
}