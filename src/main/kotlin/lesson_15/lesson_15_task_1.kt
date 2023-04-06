package lesson_15

interface Fly {
    fun flying() {
        println("Это существо летает")
    }
}

interface Swim {
    fun swimming() {
        println("Это существо плавает")
    }
}

class Karas() : Swim {
    override fun swimming() {
        println("Карась плавающее существо")
    }
}

class Seagull() : Fly {
    override fun flying() {
        println("Чайка летающее существо")
    }
}

class Duck() : Fly {
    override fun flying() {
        println("Утка летающее существо")
    }
}

fun main() {
    val karas = Karas()
    karas.swimming()

    val seagull = Seagull()
    seagull.flying()

    val duck = Duck()
    duck.flying()
}