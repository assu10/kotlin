package assu.study.kotlinme.chap05.complexConstructors

private var counter = 0

class Message(text: String) {
    private val content: String

    // 생성자 파라메터에 var, val 가 없어도 init 블록에서 사용 가능
    init {
        counter += 10
        content = "[$counter] $text"
    }

    override fun toString() = content
}

fun main() {
    val m1 = Message("Hello World")
    println(m1) // [10] Hello World

    val m2 = Message("AAAAA")
    println(m2) // [20] AAAAA
}
