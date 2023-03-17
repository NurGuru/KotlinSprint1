package lesson_3

fun main() {
    val move = "D2-D4;0".split('-', ',', ';')
    val from = move[0]
    val to = move[1]
    val id = move[2]

    println(from)
    println(to)
    println(id)
}