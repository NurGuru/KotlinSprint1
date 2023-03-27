package lesson_10
fun main() {
    validation()
    }

fun validation (){
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()
    if (password.length<4){
        println("Логин или пароль недостаточно длинные")
    }else{
        println("Добро пожаловать")
    }
}