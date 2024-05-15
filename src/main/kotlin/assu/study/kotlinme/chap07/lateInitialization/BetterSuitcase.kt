package assu.study.kotlinme.chap07.lateInitialization

interface Bag1 {
    fun setUp()
}

class BetterSuitcase : Bag1 {
    // String? 이 아닌 String 타입으로 정의
    lateinit var items: String

    override fun setUp() {
        items = "aaa, bbb, ccc"
    }

    // null 검사를 하지 않음
    fun checkItems(): Boolean = "aaa" in items
}

fun main() {
    val suitcase = BetterSuitcase()
    suitcase.setUp()

    println(suitcase.checkItems()) // true
}
