package lesson_11

interface Forum {
    fun createNewUser(id: Int, login: String, password: String, mail: String): User2 {
        return User2(id, login, password, mail)
    }

    fun newMessage(authorId: Int, userName: String, message: String) {


    }

    fun printTread(){
        println(createNewUser)
    }


}