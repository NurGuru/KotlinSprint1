package lesson_9
    fun main(){
        println("Введите 5 ингредиентов ")
        val ingredients =readln()

        println(ingredients.split(",").sorted())
    }
