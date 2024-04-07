package assu.study.kotlinme.chap03.extensionProperties

// 확장 함수
fun <T> List<T>.firstOrNull(): T? =
    if (isEmpty()) null else this[0]

// 확장 프로퍼티
val <T> List<T>.firstOrNull: T?
    get() = if (isEmpty()) null else this[0]

fun main() {
    println(listOf(1, 2, 3))    // [1, 2, 3]
    println(listOf<Int>().firstOrNull()) // 확장 함수, null
    println(listOf<Int>().firstOrNull)  // 확장 프로퍼티, null
}