package lesson_10

fun main() {
    var login = ""
    do {
        println("Введите логин")
        login = readln()
    } while (validation(login.length))

    val password = createPassword()

    println("Авторизация")
    var programLogin = ""
    var programPassword = ""
    do {
        println("Введите логин")
        programLogin = readln()
        println("Введите пароль")
        programPassword = readln()
        if (programPassword != password || programLogin != login) {
            println("НЕВЕРНЫЕ ДАННЫЕ!!!\nПопробуйте еще раз.")
        }
    } while (programPassword != password || programLogin != login)
    println()


do {
    val code = createCode()
    println("Введите код из смс")
    val programCode = readln().toInt()
    if (code!=programCode){
        println("НЕВЕРНЫЙ КОД!!!\nМы вышлем новый код, попробуйте еще раз")
        println()
    }
}while (code!=programCode)

    println("Вы авторизовались!!")

}

fun validation(loginLength: Int): Boolean {
    if (loginLength < 4) {
        println("Логин недостаточно длинный")
    }
    return loginLength < 4
}

fun createPassword(): String {
    val symbols = (1..9) + ('a'..'z') + ('A'..'Z')
    var password = ""
    for (i in 1..9) {
        password += symbols.random()
    }
    println("Ваш пароль:$password")
    println()
    return password
}

fun createCode(): Int {
    val code = (1000..9999).random()

    println("пришло смс:\nВаш код:$code")
    println()
    return code
}
