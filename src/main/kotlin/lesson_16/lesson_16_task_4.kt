package lesson_16

class Order(
    private val number: Int,
    private var orderStatus: String
) {
    private var orderStatusChanging = false
    fun sendRequest(newStatus: String) {
        println("Заявка отправлена")
        orderStatusChanging = true
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        if (orderStatusChanging) orderStatus = newStatus
        println(orderStatus)
        orderStatusChanging = false
    }
}

fun main() {
    val order = Order(47, "Заказ не готов")
    order.sendRequest("теперь готов!")
}
