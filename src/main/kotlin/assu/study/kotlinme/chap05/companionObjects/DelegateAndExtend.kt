package assu.study.kotlinme.chap05.companionObjects

interface ZI2 {
    fun f(): String

    fun g(): String
}

// ZI2 인터페이스에 u() 함수 추가
interface Extended : ZI2 {
    fun u(): String
}

// companion object (디폴트 이름은 Companion) 를 사용하여 ZI2 인터페이스 구현
class Extend : ZI2 by Companion, Extended {
    companion object : ZI2 {
        override fun f() = "Extend.f()~"

        override fun g() = "Extend.g()~"
    }

    override fun u() = "Extend: ${f()}, ${g()}"
}

// Extend 객체를 Extended 로 업캐스트 가능
private fun test(e: Extended): String {
    e.f()
    e.g()
    return e.u()
}

fun main() {
    println(test(Extend())) // Extend: Extend.f()~, Extend.g()~
}
