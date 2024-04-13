package assu.study.kotlinme.chap04.sequences

// fun <T> T.takeIf(predicate: (T) -> Boolean): T? {
//    return if (predicate(this)) this else null
// }

fun main() {
    println("aaa".takeIf { it != "bbb" }) // aaa
    println("aaa".takeIf { it != "aaa" }) // null

    // 감소하는 수열 생성
    val seq = generateSequence(5) { (it - 1).takeIf { it > 0 } }.toList()
    println(seq)
}
