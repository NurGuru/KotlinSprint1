package lesson_9

fun main() {
    println("Введите 5 ингредиентов")
    var ingredients = mutableListOf(readln(), readln(), readln(), readln(), readln())


    ingredients.add(".")
    ingredients.map {ingredients[2].uppercase() }
    println(ingredients)

}
