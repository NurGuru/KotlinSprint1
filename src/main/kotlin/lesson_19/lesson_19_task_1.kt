package lesson_19

enum class Fish(val id: String) {
    GUPPY("guppy"),
    ANGELFISH("angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("SiameseFightingFish"),
}
fun main() {

    for (fish in Fish.values()) {
        println("Можно добавить ${fish.id}")
    }
}
