package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "грибы", "сметана", "перец", "соль")
    println("Какой ингредиент найти?")
    val searchingIngredient = readln()
    var found = true

    for (i in arrayOfIngredients) {
        if (i != searchingIngredient) {
            found = false
        } else {
            found = true
            break
        }
    }
    if (found) {
        println("Ингредиент [$searchingIngredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}
