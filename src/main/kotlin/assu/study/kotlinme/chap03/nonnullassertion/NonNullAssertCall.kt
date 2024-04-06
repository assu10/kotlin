package assu.study.kotlinme.chap03.nonnullassertion

fun main() {
    val s: String? = "abc"

    println(s!!.length) // 3
}
