package assu.study.kotlinme.chap05.abstracts

interface AAA {
    fun f() = 1

    fun g() = "A.g"

    val n: Double
        get() = 1.1
}

interface BBB {
    fun f() = 2

    fun g() = "B.g"

    val n: Double
        get() = 2.2
}

// 인터페이스 AAA, BBB 의 함수 f(), g() 와 프로퍼티 n 의 시그니처가 같기 때문에 충돌을 해결해줘야 함
class CCC : AAA, BBB {
    // 멤버 함수를 오버라이드하여 충돌 해결
    override fun f() = 0

    // super 키워드를 사용하여 기반 클래스의 함수 호출
    override fun g() = super<AAA>.g()

    override val n: Double
        get() = super<AAA>.n + super<BBB>.n
}

fun main() {
    val c = CCC()

    println(c.f())
    println(c.g())
    println(c.n)
}
