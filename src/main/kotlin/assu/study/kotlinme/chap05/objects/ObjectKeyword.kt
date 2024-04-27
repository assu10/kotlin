package assu.study.kotlinme.chap05.objects

object JustOne {
    val n = 2

    fun f() = n * 2

    // this 키워드는 유일한 객체 인스턴스를 가리킴
    fun g() = this.n * 20
}

fun main() {
    // 오류
    // JustOne() 을 이용하여 JustOne 의 새로운 인스턴스 생성 불가
    // val x = JustOne()

    val result1 = JustOne.n
    val result2 = JustOne.f()
    val result3 = JustOne.g()

    println(result1)
    println(result2)
    println(result3)
}
