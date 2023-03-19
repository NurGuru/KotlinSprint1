package lesson_4

fun main() {

    val reservedTableForToday = 13
    val reservedTableForTomorrow = 9

    val freeTablesToday = reservedTableForToday < MAX_TABLE
    val freeTablesTomorrow = reservedTableForTomorrow < MAX_TABLE


    println(
        "Доступность столиков на сегодня:$freeTablesToday " +
                "Доступность столиков на завтра:$freeTablesTomorrow"
    )
    //что-то не смог разобраться как их на разные строки поставить, подскажи пожалуйста
}

const val MAX_TABLE = 13