package lesson_18

open class Animal(open val name: String = "") {
    open fun play() {}
    open fun sleep() {}
    open fun eat() {}
}

class Fox(override val name: String) : Animal() {
    override fun play() {
        println("$name - игрет")
    }

    override fun sleep() {
        println("$name - спит")
    }

    override fun eat() {
        println("$name - ест ягоды")
    }
}

class Dog(override val name: String) : Animal() {
    override fun play() {
        println("$name - игрет")
    }

    override fun sleep() {
        println("$name - спит")
    }

    override fun eat() {
        println("$name - ест кость")
    }
}

class Cat(override val name: String) : Animal() {
    override fun play() {
        println("$name - игрет")
    }

    override fun sleep() {
        println("$name - спит")
    }

    override fun eat() {
        println("$name - ест рыбу")
    }
}

fun main() {
    val fox = Fox("Лис")
    fox.play()
    fox.sleep()
    fox.eat()

    val dog = Dog("Пёс")
    dog.play()
    dog.sleep()
    dog.eat()

    val cat = Cat("Кот")
    cat.play()
    cat.sleep()
    cat.eat()
}