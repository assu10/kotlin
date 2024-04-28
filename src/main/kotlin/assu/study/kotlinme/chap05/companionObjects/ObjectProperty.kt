package assu.study.kotlinme.chap05.companionObjects

class WithObjectProperty {
    companion object {
        private var n: Int = 0 // 메모리 상에 단 하나만 존재
    }

    // companion object 를 둘러싼 클래스에서 companion object 의 private 멤버에 접근 가능
    fun incr() = ++n
}

fun main() {
    val a = WithObjectProperty()
    val b = WithObjectProperty()

    println(a.incr()) // 1
    println(b.incr()) // 2
    println(a.incr()) // 3
}
