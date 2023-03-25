package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "грибы", "сметана", "перец", "соль")
    println("Какой ингредиент найти?")
    val searchingIngredient = readln()

    if (arrayOfIngredients.indexOf(searchingIngredient) >= 0) {
        println(("Ингредиент [$searchingIngredient] в рецепте есть"))
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}