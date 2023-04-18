package lesson_18


class Point : Screen()
class Square : Screen()
class Circle : Screen()
open class Screen {

    fun draw(figure: Point, coordinateX: Float, coordinateY: Float) {
        println("Создана ТОЧКА с центром: [$coordinateX, $coordinateY]")
    }
    fun draw(figure: Point, coordinateX: Int, coordinateY: Int) {
        println("Создана ТОЧКА с центром: [$coordinateX, $coordinateY]")
    }
    fun draw(figure: Square, coordinateX: Int, coordinateY: Int) {
        println("Создан КВАДРАТ с центром: [$coordinateX, $coordinateY]")
    }
    fun draw(figure: Square, coordinateX: Float, coordinateY: Float) {
        println("Создан КВАДРАТ с центром: [$coordinateX, $coordinateY]")
    }
    fun draw(figure: Circle, coordinateX: Float, coordinateY: Float) {
        println("Создан КРУГ с центром: [$coordinateX, $coordinateY]")
    }
    fun draw(figure: Circle, coordinateX: Int, coordinateY: Int) {
        println("Создан КРУГ с центром: [$coordinateX, $coordinateY]")
    }
}
fun main() {

    val point = Screen()
    point.draw(Point(), 0.6268F, 1.55797F)

    val square = Screen()
    square.draw(Square(), 2, 5)

    val circle = Screen()
    circle.draw(Circle(), 5F, 6.041F)
}