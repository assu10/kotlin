package assu.study.kotlinme.chap03.overloading

class Overloading {
    fun f1() = 0

    fun f1(n: Int) = n + 2
}

fun main() {
    val o = Overloading()
    val result1 = o.f1()
    val result2 = o.f1(1)

    println(result1) // 0
    println(result2) // 3
}
