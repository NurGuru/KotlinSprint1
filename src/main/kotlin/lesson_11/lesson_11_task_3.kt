package lesson_11

enum class UserStatus(val label: String) {
    TALK("разговаривает"),
    MIC_OFF("микрофон выключен"),
    USER_MUTED("пользователь отключен");
}

class RoomCard(
    val img: String,
    val roomName: String,
    val members: List<User>
)

class User(
    val name: String,
    val avatar: String,
    val status: UserStatus,
)

fun main() {
    val user1 = User("John", "картинка аватара пользователя", UserStatus.USER_MUTED)
    val user2 = User("Steve", "картинка аватара пользователя", UserStatus.TALK)
    val user3 = User("Oleg", "картинка аватара пользователя", UserStatus.MIC_OFF)
    val user4 = User("Sasha", "картинка аватара пользователя", UserStatus.TALK)

    val rooms = listOf(
        RoomCard(
            img = "картинка автара комнаты",
            roomName = "Russian Speaking Club",
            members = listOf(user3, user4)
        ),
        RoomCard(
            img = "картинка автара комнаты",
            roomName = "English Speaking Club",
            members = listOf(user1, user2)
        )
    )
    rooms.forEach {
        println("${it.roomName},${it.img},${it.members}")
    }
}



