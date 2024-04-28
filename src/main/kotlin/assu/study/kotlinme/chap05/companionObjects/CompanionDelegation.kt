package assu.study.kotlinme.chap05.companionObjects

interface ZI1 {
    fun f(): String

    fun g(): String
}

class ZIClosed : ZI1 {
    override fun f() = "ZIClosed.f()~"

    override fun g() = "ZIClosed.g()~"
}

class ZIDelegation {
    // companion object 는 ZI1 인터페이스를 ZIClosed 객체를 사용(by) 하여 구현함
    companion object : ZI1 by ZIClosed()

    fun u() = println("ZIDelegation: ${f()} ${g()}~")
}

// open 이 아닌 ZIClosed 클래스를 위임에 사용하고,
// 이 위임을 오버라이드하고 확장함
class ZIDelegationInheritance {
    // companion object 는 ZI1 인터페이스를 ZIClosed 객체를 사용(by) 하여 구현함
    companion object : ZI1 by ZIClosed() {
        override fun g() = "ZIDelegationInheritance.g()~"

        fun h() = "ZIDelegationInheritance.h()~"
    }

    fun u() = println("ZIDelegationInheritance: ${f()} ${g()} ${h()}")
}

fun main() {
    ZIDelegation.f() //
    ZIDelegation.g() //
    ZIDelegation().u() // ZIDelegation: ZIClosed.f()~ ZIClosed.g()~~

    ZIDelegationInheritance.f() //
    ZIDelegationInheritance.g() //
    ZIDelegationInheritance().u() // ZIDelegationInheritance: ZIClosed.f()~ ZIDelegationInheritance.g()~ ZIDelegationInheritance.h()~
}
