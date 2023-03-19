package lesson_4

fun main() {
    val firstWeight = 20
    val firstValume = 80
    val secondtWeight = 50
    val secondtValume = 100

    println("Average для груза с весом 20 кг и объемом 80: ${firstWeight >= MIN_WEIGHT && firstWeight <= MAX_WEIGHT && firstValume < MAX_VOLUME}")
    println("Average для груза с весом 50 кг и объемом 100: ${secondtWeight >= MIN_WEIGHT && secondtWeight <= MAX_WEIGHT && secondtValume < MAX_VOLUME}")
}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100
