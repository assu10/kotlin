package assu.study.kotlinme.chap07.lateInitialization

class WithLate {
    lateinit var x: String

    fun status() = "${::x.isInitialized}"
}

lateinit var y: String

fun main() {
    println("${::y.isInitialized}") // false

    y = "aaa"
    println("${::y.isInitialized}") // true

    val withLate = WithLate()
    println(withLate.status()) // false
    println(withLate::status) // fun assu.study.kotlinme.chap07.lateInitialization.withLate.status(): kotlin.String

    withLate.x = "bb"
    println(withLate.status()) // true
}
