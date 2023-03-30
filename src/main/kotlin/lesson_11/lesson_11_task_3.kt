package lesson_11

class RoomCard(val img: String, val roomName: String, val members: List<User>) {}

class User(val name: String, val avatar: String) {
}

fun main() {
    val user1 = User("John", "картинка аватара пользователя")
    val user2 = User("Steve", "картинка аватара пользователя")
    val room1 = RoomCard("картинка автара комнаты", "English Speaking Club", listOf(user1, user2))
    println(room1.img)
    println(room1.roomName)
    println(user1.name)
    println(user2.name)

    val user3 = User("Oleg", "картинка аватара пользователя")
    val user4 = User("Sasha", "картинка аватара пользователя")
    val room2 = RoomCard("картинка автара комнаты", "Russian Speaking Club", listOf(user3, user4))
    println(room2.img)
    println(room2.roomName)
    println(user3.name)
    println(user4.name)
}