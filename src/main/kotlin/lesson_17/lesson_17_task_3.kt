package lesson_17

class Package(
    var name: String,
    var failsNumber: Int,
    val secret: Boolean
) {
    val packageName: String = name
        get() = if (secret) "скрытая папка" else field

    val packageFiles: Int = 0
        get() = if (secret) 0 else field

}

fun main() {
    val package1 = Package("Папка1", 27, true)
    println(package1.packageName)
    println(package1.packageFiles)
}