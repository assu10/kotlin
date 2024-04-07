package assu.study.kotlinme.chap03.extensionProperties

// 확장 프로퍼티 선언
val String.indices: IntRange
    get() = 0 until length

fun main() {
    println("abc".indices)  // 0..2
}