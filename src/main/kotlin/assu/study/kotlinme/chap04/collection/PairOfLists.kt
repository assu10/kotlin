package assu.study.kotlinme.chap04.collection

fun createPair() = Pair(1, "one")

fun main() {
    val (i, s) = createPair()

    println(i) // 1
    println(s) // one
}
