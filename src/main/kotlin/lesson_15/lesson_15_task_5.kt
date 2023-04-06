package lesson_15

interface Movable {
    val carType: String
    fun move() {
        println("$carType начал движение")
    }
}

interface PassengerTransportable {
    val passengerTransportingCapacity: Byte
    fun passengerTransporting(carType: String) {
        println("$carType перевозит $passengerTransportingCapacity пассажиров")
    }
}

interface CargoTransportable {
    val cargoTransportingCapacity: Byte
    fun cargoTransporting(carType: String, passengerQuantity: Byte) {
        println("$carType перевозит $cargoTransportingCapacity тонны груза и $passengerQuantity пассажира")
    }
}

class CargoCar(
    override val carType: String,
    override val passengerTransportingCapacity: Byte = 1,
    override val cargoTransportingCapacity: Byte = 2
) : Movable, PassengerTransportable, CargoTransportable

class CommonCar(
    override val carType: String,
    override val passengerTransportingCapacity: Byte = 3
) : Movable, PassengerTransportable

fun main() {
    val car1 = CommonCar("Легковушка")
    car1.move()
    car1.passengerTransporting(car1.carType)
    println()
    val cargo1 = CargoCar("Грузовик")
    cargo1.move()
    cargo1.cargoTransporting(cargo1.carType, cargo1.passengerTransportingCapacity)
}