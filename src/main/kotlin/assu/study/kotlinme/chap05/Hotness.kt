package assu.study.kotlinme.chap05

interface Hotness {
    fun feedback(): String
}

// 인터페이스를 구현하는 enum
enum class SpiceLevel : Hotness {
    Mild {
        override fun feedback() = "Mild~"
    },
    Medium {
        override fun feedback() = "Medium~"
    },
}

fun main() {
    val result1 = SpiceLevel.values() // values() 는 Array 를 반환함
    val result2 = SpiceLevel.values().toList() // 따라서 배열을 List 로 만듦
    val result3 = SpiceLevel.values().map { it.feedback() }

    println(result1) // [Lassu.study.kotlinme.chap05.SpiceLevel;@b1bc7ed
    println(result2) // [Mild, Medium]
    println(result3) // [Mild~, Medium~]
}
