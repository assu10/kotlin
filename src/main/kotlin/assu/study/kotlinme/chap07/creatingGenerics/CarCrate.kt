package assu.study.kotlinme.chap07.creatingGenerics

class Car {
    override fun toString() = "Car~"
}

class CarCrate(private var c: Car) {
    override fun toString() = "CarCrate~"

    fun put(car: Car) {
        c = car
    }

    // Car 의 타입만 반환할 수 있음
    fun get(): Car = c
}

fun main() {
    val cc = CarCrate(Car())
    val car: Car = cc.get()

    println(cc) // CarCrate~
    println(car) // Car~
}
