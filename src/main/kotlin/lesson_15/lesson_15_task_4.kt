package lesson_15

abstract class Product(
    val name: String,
    val quantity: Int
)

interface Search {
    fun searchProduct(searchingProduct: String) {
        println("Выполняется поиск товара: $searchingProduct")
    }
}

class Instruments(
    name: String,
    quantity: Int
) : Product(name, quantity), Search

class ComplectStuff(
    name: String,
    quantity: Int
) : Product(name, quantity)

fun main() {
    val piano = Instruments("Пианино", 4)
    piano.searchProduct("Пианино")
    println(piano.quantity)

    val pianoKey = ComplectStuff("Клавиши пианино", 148)
    println("Комплектующего товара: ${pianoKey.name} осталось ${pianoKey.quantity} ")

}
