package lesson_15

abstract class Message(val text: String) {
    fun connectToServer() {
        println("Соединение с сервером...")
    }

    fun sendText() {
        println("Отправка сообщения:\n$text")
    }
}

class Temperature(text: String) : Message(text)
class Precipitation(text: String) : Message(text)

fun main() {
    val sendTemperature = Temperature("Температура: -8")
    sendTemperature.connectToServer()
    sendTemperature.sendText()
    println()
    val sendPrecipitation = Precipitation("Выпало много снега")
    sendPrecipitation.connectToServer()
    sendPrecipitation.sendText()
}
