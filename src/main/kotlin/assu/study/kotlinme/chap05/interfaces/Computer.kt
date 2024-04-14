package assu.study.kotlinme.chap05.interfaces

interface Computer {
    fun prompt(): String

    fun calculateAnswer(): Int
}

// Computer 인터페이스를 구현하는 클래스
class DeskTop : Computer {
    override fun prompt() = "Hi"

    override fun calculateAnswer() = 11
}

// Computer 인터페이스를 구현하는 클래스
class DeepThought : Computer {
    override fun prompt() = "Thinking..."

    override fun calculateAnswer() = 12
}

fun main() {
    val computers = listOf(DeskTop(), DeepThought())

    val result1 = computers.map { it.calculateAnswer() }
    val result2 = computers.map { it.prompt() }

    println(result1) // [11, 12]
    println(result2) // [Hi, Thinking...]
}
