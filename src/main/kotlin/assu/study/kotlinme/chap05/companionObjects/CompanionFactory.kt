package assu.study.kotlinme.chap05.companionObjects

class Numbered2
// Numbered2 의 비공개 생성자
    private constructor(private val id: Int) {
        override fun toString(): String = "$id~"

        companion object Factory {
            fun create(size: Int) = List(size) { Numbered2(it) }
        }
    }

fun main() {
    val result1 = Numbered2.create(0)
    val result2 = Numbered2.create(3)

    // Cannot access '<init>': it is private in 'Numbered2
    // val result3 = Numbered2(1)

    println(result1) // []
    println(result2) // [0~, 1~, 2~]
}
