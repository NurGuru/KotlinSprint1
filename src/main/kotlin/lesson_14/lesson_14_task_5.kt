package lesson_14

import kotlin.math.pow
import kotlin.math.sqrt

abstract class Figure {
    abstract val color: String
    abstract fun getSquare(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    val radius: Double,
    color: String
) : Figure() {

    override val color: String = color
    override fun getSquare(): Double {
        return 3.14 * radius.pow(2.0)
    }

    override fun getPerimeter(): Double {
        return 2 * 3.14 * radius
    }
}

class Rectangle(
    val height: Double,
    val width: Double,
    color: String,
) : Figure() {

    override val color: String = color
    override fun getSquare(): Double {
        return height * width
    }

    override fun getPerimeter(): Double {
        return 2 * (height * width)
    }
}

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
    color: String,
) : Figure() {

    override val color: String = color
    override fun getSquare(): Double {
        val p = (a + b + c) / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }

    override fun getPerimeter(): Double {
        return a + b + c
    }
}

fun main() {
    val circle1 = Circle(7.0, "зеленный")
    val circle2 = Circle(4.5, "черный")

    val rectangle1 = Rectangle(4.0, 5.0, "красный")
    val rectangle2 = Rectangle(7.0, 8.0, "черный")


    val triangle1 = Triangle(3.0, 4.0, 5.0, "красный")
    val triangle2 = Triangle(4.0, 5.0, 6.0, "черный")

    val allFigures: List<Figure> = listOf(
        circle1,
        circle2,
        rectangle1,
        rectangle2,
        triangle1,
        triangle2
    )

    fun getRedFigureSquareSum(
        getFigures: List<Figure> = allFigures

    ): Double {
        var redFigureSquareSum = 0.0
        getFigures.forEach {
            if (it.color == "красный") {
                redFigureSquareSum += it.getSquare()
            }
        }
        return redFigureSquareSum
    }

    fun getRedFigurePerimeterSum(
        getFigures: List<Figure> = allFigures
    ): Double {
        var redFigurePerimeterSum = 0.0
        getFigures.forEach {
            if (it.color == "красный") {
                redFigurePerimeterSum += it.getPerimeter()
            }
        }
        return redFigurePerimeterSum
    }

    println("Сумма периметров красных фигур: ${getRedFigurePerimeterSum()} \nСумма площадей красных фигур: ${getRedFigureSquareSum()}")
}

