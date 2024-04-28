package assu.study.kotlinme.chap05.companionObjects

class WithCompanion {
    companion object {
        val i = 3

        fun f() = i * 3
    }

    // 클래스 멤버는 companion object 의 원소에 아무런 한정을 사용하지 않고 접근 가능
    // 만일 companion object 가 아니라 일반 object 였다면 Unresolved reference: i, f() 오류 발생
    fun g() = i + f()
}

// companion object 에 대한 확장 함수
fun WithCompanion.Companion.h() = f() * i

fun main() {
    val wc = WithCompanion()

    val result1 = wc.g()

    // 클래스 밖에서는 companion object 의 멤버를 클래스 이름을 사용하여 참조 가능
    // 만일 companion object 가 아니었다면 클래스 밖에서 object 의 원소 참조 불가
    val result2 = WithCompanion.i

    // 클래스 밖에서는 companion object 의 멤버를 클래스 이름을 사용하여 참조 가능
    // 만일 companion object 가 아니었다면 클래스 밖에서 object 의 원소 참조 불가
    val result3 = WithCompanion.f()
    val result4 = WithCompanion.h()

    println(result1) // 12
    println(result2) // 3
    println(result3) // 9
    println(result4) // 27
}
