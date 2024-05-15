package assu.study.kotlinme.chap07.lateInitialization

interface Bag {
    fun setUp()
}

class SuiteCase : Bag {
    private var items: String? = null

    // setUp() 을 오버라이드하여 items 초기화
    override fun setUp() {
        items = "aaa, bbb, ccc"
    }

    // 매번 items 에 대해 null 검사를 해야 함
    fun ckeckItems(): Boolean = items?.contains("aaa") ?: false
}
