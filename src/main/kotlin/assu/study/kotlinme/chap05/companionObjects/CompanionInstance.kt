package assu.study.kotlinme.chap05.companionObjects

interface ZI {
    fun f(): String

    fun g(): String
}

// open 으로 되어있어야 다른 곳에서 상속 가능
open class ZIOpen : ZI {
    override fun f() = "ZIOpen.f()~"

    override fun g() = "ZIOpen.g()~"
}

class ZICompanion {
    // ZIOpen 객체를 companion object 로 사용
    companion object : ZIOpen()

    fun u() = println("ZICompanion: ${f()} ${g()}~")
}

// ZIOpen 클래스를 확장하고, 오버라이드 하면서 ZIOpen 객체 생성
class ZICompanionInheritance {
    companion object : ZIOpen() {
        override fun g() = "ZICompanionInheritance.g()~"

        fun h() = "ZICompanionInheritance.h()~"
    }

    fun u() = println("ZICompanionInheritance: ${f()} ${g()} ${h()}")
}

// companion object 를 만들면서 ZI 인터페이스 구현
class ZIClass {
    companion object : ZI {
        override fun f() = "ZIClass.f()~"

        override fun g() = "ZIClass.g()~"
    }

    fun u() = println("ZIClass: ${f()} ${g()}")
}

fun main() {
    ZIClass.f() //
    ZIClass.g() //
    ZIClass().u() // ZIClass: ZIClass.f()~ ZIClass.g()~

    ZICompanion.f() //
    ZICompanion.g() //
    ZICompanion().u() // ZICompanion: ZIOpen.f()~ ZIOpen.g()~~

    ZICompanionInheritance.f() //
    ZICompanionInheritance.g() //
    ZICompanionInheritance().u() // ZICompanionInheritance: ZIOpen.f()~ ZICompanionInheritance.g()~ ZICompanionInheritance.h()~
}
