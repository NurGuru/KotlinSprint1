package lesson_2

fun main() {
    val numberOfEmployees = 50
    val numberOfInterns = 30
    val salaryOfOneEmployer = 30000
    val salaryOfOneIntern = 20000
    val allEmployersSalary = numberOfEmployees * salaryOfOneEmployer
    val allInternsSalary = numberOfInterns * salaryOfOneIntern
    val salaryToEveryone = allEmployersSalary + allInternsSalary
    val middleSalary = salaryToEveryone / (numberOfEmployees + numberOfInterns)

    println(allEmployersSalary)
    println(salaryToEveryone)
    println(middleSalary)
}