package assu.study.kotlinme.chap05.inheritanceExtensions

open class Base {
    // 멤버 함수
    open fun f() = println("Base.f()")
}

class Derived : Base() {
    // 멤버 함수
    override fun f() = println("Derived.f()")
}

// 확장 함수
fun Base.g() = println("Base.g()")

fun Derived.g() = println("Derived.g()")

fun useBase(b: Base) {
    println("useBase: ${b::class.simpleName}")
    println(b.f())
    println(b.g())
}

fun main() {
    // useBase: Base
    // Base.f()
    // kotlin.Unit
    // Base.g()
    // kotlin.Unit
    useBase(Base())

    // useBase: Derived
    // Derived.f()
    // kotlin.Unit
    // Base.g()  --> 멤버 함수인 f() 에서는 다형성이 동작하지만, 확장 함수인 g() 에서는 작동하지 않음
    // kotlin.Unit
    useBase(Derived())
}
