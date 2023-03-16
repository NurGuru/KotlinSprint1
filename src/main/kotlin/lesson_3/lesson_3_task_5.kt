package lesson_3

fun main() {
    var move = "D2-D4;0"
    var from = "${move[0]}${move[1]}"
    var to = "${move[3]}${move[4]}"
    var id = move[6]

    println(from)
    println(to)
    println(id)
}