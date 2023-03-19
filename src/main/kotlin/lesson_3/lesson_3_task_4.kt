package lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var id = 1
    var move = "$from-$to;$id"

    println(move)
    from = "D2"
    to = "D3"
    id += 1
    move = "$from-$to;$id"
    println(move)
}