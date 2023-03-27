package lesson_9
    fun main(){
        println("Введите 5 ингредиентов ")
        var ingredients = mutableListOf("${readln()},${readln()},${readln()},${readln()},${readln()}")
        println(ingredients)
        println(ingredients.sort())

    }
