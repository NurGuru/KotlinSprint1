package lesson_16

class Order(
    val number: Int,
    private var orderStatus: String
) {
    private var orderStatusChanging = false
    fun sendRequest() {
        println("Заявка отправлена")
        orderStatusChanging = true
    }

    fun changeStatus() {
        if (orderStatusChanging) orderStatus = "Заказ готов"
        println(orderStatus)
    }
}

fun main() {
    val order = Order(47, "Заказ не готов")
    order.sendRequest()
    order.changeStatus()

}
