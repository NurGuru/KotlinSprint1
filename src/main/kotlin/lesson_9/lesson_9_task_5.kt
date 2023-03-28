package lesson_9

fun main() {
    println("Введите 5 ингредиентов")
    var ingredients = mutableSetOf(readln())

    for (i in 0..3){
        ingredients.add("${readln()}")
    }

    ingredients=ingredients.sorted().toMutableSet()
    ingredients.add(".")

    println(ingredients)


//    ingredients.toMutableList()[0].capitalize()
//    ingredients.first().uppercase()
//    println( )
//    ingredients.add(".")
}
