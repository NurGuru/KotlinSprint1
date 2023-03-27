package lesson_9

fun main() {
    val ingredients = mutableListOf("яйцо", "сметана", "хлеб")
    ingredients.forEach { println(it) }

    println("В рецепте есть базоывае ингредиенты: $ingredients")
    println("Желаете добавить еще?")
    val askToAdd = readln()

    if (askToAdd == "Да" || askToAdd == "да") {
        println("Какой ингредиент вы хотите добавить")
        val addIngredient = readln()
        ingredients.add("$addIngredient")
        println("Тепреь в рецепте следующие ингредиенты:$ingredients")
    }

}