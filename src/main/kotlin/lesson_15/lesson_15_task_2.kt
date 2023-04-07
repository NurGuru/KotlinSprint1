package lesson_15

abstract class Message(val text: Byte) {
    fun connectToServer() {
        println("Соединение с сервером...")
    }

    open fun sendText() {
        println("Отправка сообщения:\n$text")
    }
}

class Temperature(text: Byte) : Message(text) {
    override fun sendText() {
        println("Отправка сообщения:\nТемпература:$text")
    }
}

class Precipitation(text: Byte) : Message(text) {
    override fun sendText() {
        println("Отправка сообщения:\nОсадки:$text мм рт ст")
    }
}

fun main() {
    val sendTemperature = Temperature(-8)
    sendTemperature.connectToServer()
    sendTemperature.sendText()
    println()
    val sendPrecipitation = Precipitation(12)
    sendPrecipitation.connectToServer()
    sendPrecipitation.sendText()
}
