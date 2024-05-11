package assu.study.kotlinme.chap07.creatingGenerics

class Car1 {
    override fun toString() = "Car1~"
}

open class Crate<T>(private var contents: T) {
    fun put(item: T) {
        contents = item
    }

    // T 타입의 값이 결과로 나옴
    fun get(): T = contents
}

fun main() {
    val cc = Crate(Car1())
    val car: Car1 = cc.get()

    println(cc::class.simpleName) // Crate
    println(car) // Car1~
}
