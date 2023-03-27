package lesson_9

fun main() {
    val portionSize = listOf(2, 50, 15)
    println("Сколько порций?")
    val portionNumber = readln().toInt()
    val portionSize2 = portionSize.map { it * portionNumber }
    println("На $portionNumber порций вам понадобиться: Яиц - ${portionSize2[0]}, молока - ${portionSize2[1]}, сливочногомасла - ${portionSize2[2]}  ")
}