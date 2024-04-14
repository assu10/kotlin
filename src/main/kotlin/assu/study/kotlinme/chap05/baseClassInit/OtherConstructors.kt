package assu.study.kotlinme.chap05.baseClassInit

open class Base(val i: Int)

class Derived : Base {
    constructor(i: Int) : super(i) // 기반 클래스의 생성자 호출
    constructor() : this(9) // 파생 클래스 자신의 생성자 호출
}

fun main() {
    val d1 = Derived()

    println(d1) // assu.study.kotlinme.chap05.baseClassInit.Derived@4f3f5b24
    println(d1.i) // 9

    val d2 = Derived(11)

    println(d2) // assu.study.kotlinme.chap05.baseClassInit.Derived@15aeb7ab
    println(d2.i) // 11
}
