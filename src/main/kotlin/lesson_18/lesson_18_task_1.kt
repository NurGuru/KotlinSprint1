package lesson_18

class Order() {
    fun printOrder(
        orderNumber: Int,
        product: String
    ) {
        println("Заказан товар: $product")
    }

    fun printOrder(
        orderNumber: Int,
        product: List<String>
    ) {
        println("Заказаны следующие товары: $product")
    }
}

fun main() {
    val order1 = Order()
    order1.printOrder(23, "Гиатара")

    val order2 = Order()
    order2.printOrder(24, listOf("Барабан", "Скрипка"))
}