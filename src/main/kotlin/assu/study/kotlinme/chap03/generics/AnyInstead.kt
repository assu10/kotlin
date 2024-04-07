package assu.study.kotlinme.chap03.generics

class AnyHolder(private val a: Any) {
    fun getValue(): Any = a
}

data class Automobile2(val brand: String)

class Dog {
    fun bark() = "Ruff!!"
}

fun main() {
    val h1 = AnyHolder(Automobile2("BMW"))
    val a1 = h1.getValue()
    println(a1) // Automobile2(brand=BMW)

    val h2 = AnyHolder(Dog())
    val a2 = h2.getValue()
    println(a2) // assu.study.kotlinme.chap03.generics.Dog@34c45dca
    // 컴파일 되지 않음
    // println(a2.bark())

    val h3 = GenericHolder(Dog())
    val a3 = h3.getValue()
    println(a3) // assu.study.kotlinme.chap03.generics.Dog@5b6f7412
    println(a3.bark())  // Ruff!!
}