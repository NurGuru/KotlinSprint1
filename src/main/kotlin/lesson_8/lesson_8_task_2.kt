package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "грибы", "сметана", "перец", "соль")
    println("Какой ингредиент найти?")
    val searchingIngredient = readln()

    for (i in arrayOfIngredients) {
        if (i == searchingIngredient) {
            println("Ингредиент [$i] в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет.")
        }
    }
}