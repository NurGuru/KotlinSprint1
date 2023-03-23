package lesson_8

fun main() {
    println("Введите количество ингредиентов")
    val numberOfIngredients = readln().toInt()
    val arrayOfIngredients = arrayOf("")//вот тут


    for (i in 0..numberOfIngredients) {
        println("Введите ингредиент № ${i+1}")
        arrayOfIngredients[i] = readln()
        println("${arrayOfIngredients[i]}")
    }
}


