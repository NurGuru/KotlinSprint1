package lesson_19

enum class Category(val id: Int) {
    CLOTHES(1),
    OFFICE_SUPPLIES(2),
    OTHERS(3);
}

fun getNameCategory(category: Category): String {
    return when (category) {
        Category.CLOTHES -> "Одежда"
        Category.OFFICE_SUPPLIES -> "Канцелярия"
        Category.OTHERS -> "Другое"
    }
}

class Product(
    private val productName: String,
    private val id: Int,
    private val category: Category,
) {
    fun getInfoAboutProduct(): String {
        return "Название товара: $productName. Артикул товара:$id. Категория товара:${getNameCategory(category)}\n"
    }
}

fun main() {
    val product1 = Product("Свитер", 11, Category.CLOTHES)
    val product2 = Product("Ластик", 22, Category.OFFICE_SUPPLIES)
    val product3 = Product("Портфель", 33, Category.OTHERS)

    println(product1.getInfoAboutProduct())
    println(product2.getInfoAboutProduct())
    println(product3.getInfoAboutProduct())
}
