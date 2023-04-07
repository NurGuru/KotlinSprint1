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
        println("Карась плавает")
    }
}

class Seagull() : Fly {
    override fun flying() {
        println("Чайка  летает")
    }
}


class Duck() : Fly, Swim {
    override fun flying() {
        println("Утка летает")
    }

    override fun swimming() {
        println("Утка плавает")
    }
}

fun main() {
    val karas = Karas()
    karas.swimming()

    val seagull = Seagull()
    seagull.flying()

    val duck = Duck()
    duck.flying()
    duck.swimming()
}