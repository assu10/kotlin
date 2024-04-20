package assu.study.kotlinme.chap05.compositions

class Engine {
    fun start() = println("Engine started")

    fun stop() = println("Engine stopped")
}

class Wheel {
    fun inflate(psi: Int) = println("Wheel inflation: $psi")
}

class Window(val side: String) {
    fun up() = println("$side Window up")

    fun down() = println("$side Window down")
}

class Door(val side: String) {
    val window = Window(side) // 합성

    fun open() = println("$side Door open")

    fun close() = println("$side Door close")
}

// 합성으로 이루어짐
class Car {
    var engine = Engine()
    var wheel = List(4) { Wheel() }
    val leftDoor = Door("left")
    val rightDoor = Door("right")
}

fun main() {
    val car = Car()
    car.leftDoor.open() // left Door open
    car.rightDoor.open() // right Door open
    car.wheel[0].inflate(11) // Wheel inflation: 11
    car.engine.start() // Engine started
}
