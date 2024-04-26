package assu.study.kotlinme.chap05.downcasting

interface Base11 {
    fun f()
}

class Derived11 : Base11 {
    override fun f() {}

    fun g() {}
}

class Derived22 : Base11 {
    override fun f() {}

    fun h() {}
}

fun main() {
    val b1: Base11 = Derived11() // 업캐스트
    // b1.g()   // 호출 불가
    if (b1 is Derived11) {
        b1.g() // 호출 가능 `is` 검사의 영역 내부
    }

    val b2: Base11 = Derived22() // 업캐스트
    // b2.h();  // 호출 불가
    if (b2 is Derived22) {
        b2.h() // 호출 가능, `is` 검사의 영역 내부
    }
}
