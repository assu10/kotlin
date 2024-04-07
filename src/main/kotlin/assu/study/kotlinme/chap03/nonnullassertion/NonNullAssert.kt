package assu.study.kotlinme.chap03.nonnullassertion

fun main() {
    val x: String? = "abc"

    println(x!!) // abc

    val a: String? = null
    // println(a!!) // NullPointException

    val b: String = a!!
    println(b) // NPE
}
