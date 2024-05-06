package assu.study.kotlinme.chap07.extensionLambdas

open class Base {
    open fun f() = 1
}

class Derived : Base() {
    override fun f() = 2
}

// 일반 확장 함수
fun Base.g() = f()

// 확장 람다
fun Base.h(x: Base.() -> Int) = x()

fun main() {
    val b: Base = Derived() // 업캐스트

    val result1 = b.g()
    val result2 = b.h { f() }

    println(result1) // 2
    println(result2) // 2
}
