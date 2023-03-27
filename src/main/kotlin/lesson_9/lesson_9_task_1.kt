package lesson_9

fun main() {
    val ingredients = listOf("яйца","сметана", "соль", "перец")

    println("В рецепте есть следующие ингредиенты $ingredients")
    ingredients.forEach { (println(it))
    }

}