package assu.study.kotlinme.chap07.operatorOverloading

class A(val i: Int)

data class B(val i: Int)

fun main() {
    // 일반 클래스
    val a1 = A(1)
    val a2 = A(1)
    val c = a1

    // a1 과 a2 는 메모리에서 다른 객체를 가리키므로 두 참조는 다름 (false)
    println(a1 == a2) // false

    // a1 과 c 는 메모리에서 같은 객체를 가리키므로 두 참조는 같음 (true)
    println(a1 == c) // true

    // data 클래스
    val b1 = B(1)
    val b2 = B(1)
    val d = b1

    // data 클래스는 자동으로 내용을 비교해주는 equals() 를 오버라이드 하므로 true 리턴
    println(b1 == b2) // true
    println(b1 == d) // true
}
