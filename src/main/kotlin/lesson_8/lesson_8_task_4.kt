package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "грибы", "сметана", "перец", "соль")

    for (i in arrayOfIngredients) {
        println("Ингредиент №${arrayOfIngredients.indexOf(i) + 1} - $i")
    }
    println()
    println("Какой ингредиент заменить?")
    val ingredientForChange = readln()
    val numberOfIngredientForChange = arrayOfIngredients.indexOf(ingredientForChange)
    if (numberOfIngredientForChange == -1) {
        println("Такого ингредиента нет в списке!")

    } else {
        println("Какой ингредиент добавить?")
        val newIngredient = readln()
        arrayOfIngredients[numberOfIngredientForChange] = newIngredient
        println("Готово! Вы сохранили следующий список")
        for (i in arrayOfIngredients) {
            println("Ингредиент №${arrayOfIngredients.indexOf(i) + 1} - $i")
        }
    }
}