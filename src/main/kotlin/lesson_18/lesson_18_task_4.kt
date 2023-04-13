package lesson_18

open class Box() {
    open fun getBoxSquare(): Int {
        return getBoxSquare()
    }
}

class Rectangle(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box() {
    override fun getBoxSquare(): Int {
        println("Площадь прямоугольной коробки")
        return 2 * (length * width + length * width + width * height)
    }
}

class Cube(
    val length: Int,
) : Box() {

    override fun getBoxSquare(): Int {

        println("Площадь кубической коробки")
        return (length * length) * 6
    }
}

fun main() {
    val box1 = Rectangle(5, 6, 8)
    println("${box1.getBoxSquare()}")

    val box2 = Cube(5)
    println("${box2.getBoxSquare()}")
}
