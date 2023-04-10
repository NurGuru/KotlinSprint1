package lesson_16

import kotlin.math.pow

class Circle(private val radius: Double) {
    private val pi: Double = 3.14

    fun getCirclePerimeter(): Double {
        return 2 * radius * pi
    }

    fun getCircleSquare(): Double {
        return pi * radius.pow(2.0)
    }
}

fun main() {
    val circlePerimeter = Circle(6.5)
    println("Периметр круга = ${circlePerimeter.getCirclePerimeter()}")

    val circleSquare = Circle(6.5)
    println("Площадь круга = ${circleSquare.getCircleSquare()}")
}