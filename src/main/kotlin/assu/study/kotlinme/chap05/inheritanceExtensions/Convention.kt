package assu.study.kotlinme.chap05.inheritanceExtensions

class X

// X 의 확장 함수
fun X.f() = println("X.f()")

class Y

// Y 의 확장 함수
fun Y.f() = println("Y.f()")

// X, Y 두 타입에 대해 올바르게 동작하게 하기 위해 callF() 를 오버로드함
fun callF(x: X) = x.f()

fun callF(y: Y) = y.f()

fun main() {
    val x = X()
    val y = Y()

    x.f() // X.f()
    y.f() // Y.f()

    callF(x) // X.f()
    callF(y) // Y.f()
}
