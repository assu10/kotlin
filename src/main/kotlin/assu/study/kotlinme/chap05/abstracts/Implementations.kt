package assu.study.kotlinme.chap05.abstracts

// ch, f() 는 각각 추상 프로퍼티와 추상 함수이므로 Parent 를 구현하는 클래스는 이 두 멤버를 꼭 오버라이드해야 함
interface Parent {
    // 추상 프로퍼티
    val ch: Char

    // 추상 함수
    fun f(): Int

    // g() 가 정의된 시점에 아무 구현도 없는 추상 멤버 사용
    // 인터페이스와 추상 클래스는 해당 타입의 객체가 생성되기 전에 모든 추상 프로퍼티와 함수가 구현되도록 보장함
    fun g() = "ch = $ch; f() = ${f()}"
}

class Actual(override val ch: Char) : Parent {
    override fun f() = 11
}

class Other : Parent {
    override val ch: Char
        get() = 'B'

    override fun f() = 22
}

fun main() {
    val result1 = Actual('A').g()
    val result2 = Other().g()

    println(result1) // ch = A; f() = 11
    println(result2) // ch = B; f() = 22
}
