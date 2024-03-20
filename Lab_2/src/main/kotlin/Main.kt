
open class Transport(var speed: Int, var power: Int)

class Car(speed: Int, power: Int, var brand: String, var model: String) : Transport(speed, power)

class Bicycle(speed: Int, power: Int, var type: String) : Transport(speed, power)

class Motorcycle(speed: Int, power: Int, var engineType: String) : Transport(speed, power)

fun main() {
    val car = Car(speed = 200, power = 300, brand = "Toyota", model = "Corolla")
    val bicycle = Bicycle(speed = 30, power = 5, type = "Mountain")
    val motorcycle = Motorcycle(speed = 250, power = 150, engineType = "V-Twin")

    println("Characteristics of the car:")
    println("Speed: ${car.speed} km/h")
    println("Power: ${car.power} kW")
    println("Brand: ${car.brand}")
    println("Model: ${car.model}")

    println("\nCharacteristics of the bicycle:")
    println("Speed: ${bicycle.speed} km/h")
    println("Power: ${bicycle.power} W")
    println("Type: ${bicycle.type}")

    println("\nCharacteristics of the motorcycle:")
    println("Speed: ${motorcycle.speed} km/h")
    println("Power: ${motorcycle.power} kW")
    println("Engine type: ${motorcycle.engineType}")
}
