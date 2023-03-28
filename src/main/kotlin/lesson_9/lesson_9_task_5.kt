package lesson_9

fun main() {
    println("Введите 5 ингредиентов")
    var ingredients = mutableSetOf(readln())

    for (i in 0..3) {
        ingredients.add("${readln()}")
    }

    ingredients = ingredients.sorted().toMutableSet()
    println(ingredients)

    val new = ingredients.toMutableList()
    new[0] = new[0][0].uppercase() + new[0].substring(1)
    new[new.lastIndex] = new[new.lastIndex] + "."

    println(new)
}





