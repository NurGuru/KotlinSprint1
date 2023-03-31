package lesson_11

import kotlin.String
import kotlin.String as String1

class RoomCard(val img: String1, val roomName: String1, val members: List<User>) {}

class User(
    val name: String1,
    val avatar: String1,
    val status: String = "разговаривает,микрофон выключен,пользователь заглушен,"
) {
}

fun main() {
    val user1 = User("John", "картинка аватара пользователя")
    val user2 = User("Steve", "картинка аватара пользователя")
    val room1 = RoomCard("картинка автара комнаты", "English Speaking Club", listOf(user1, user2))


    val user3 = User("Oleg", "картинка аватара пользователя")
    val user4 = User("Sasha", "картинка аватара пользователя")
    val room2 = RoomCard("картинка автара комнаты", "Russian Speaking Club", listOf(user3, user4))

}