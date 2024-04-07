package assu.study.kotlinme.chap03.generics

class GenericHolder<T>(private val a: T) {
    fun getValue(): T = a
}

fun main() {
    val h1 = GenericHolder(Automobile("BMW"))
    val a1: Automobile = h1.getValue()
    println(a1) // Automobile(brand=BMW)

    val h2 = GenericHolder(1)
    val a2: Int = h2.getValue()
    println(a2) // 1

    val h3 = GenericHolder("Assu")
    val a3: String = h3.getValue()
    println(a3) // Assu
}