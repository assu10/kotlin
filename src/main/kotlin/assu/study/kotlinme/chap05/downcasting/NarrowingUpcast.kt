package assu.study.kotlinme.chap05.downcasting

interface Base {
    fun f()
}

class Derived1 : Base {
    override fun f() {}

    fun g() {}
}

class Derived2 : Base {
    override fun f() {}

    fun h() {}
}

fun main() {
    // 업캐스트
    val b1: Base = Derived1()

    b1.f() // 기반 클래스의 멤버 함수
    // b1.g()    // 기반 클래스에 없는 함수

    // 업캐스트
    val b2: Base = Derived2()
    b2.f() // 기반 클래스의 멤버 함수
    // b2.h()  // 기반 클래스에 없는 함수
}
