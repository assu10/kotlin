package assu.study.kotlinme.chap03.extensionProperties

val List<*>.indices: IntRange
    get() = 0 until size

fun main() {
    println(listOf(1).indices)  // 0..0
    println(listOf('a', 'b').indices)   // 0..1
    println(emptyList<Int>().indices)   // 0..-1
    println(emptyList<Int>().indices.equals(IntRange.EMPTY))    // true
}