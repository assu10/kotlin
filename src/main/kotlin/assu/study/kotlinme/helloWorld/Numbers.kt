package assu.study.kotlinme.helloWorld

fun main() {
    val i: Int = Int.MAX_VALUE
    val l: Long = Long.MAX_VALUE
    val a: Int = 2_147_483_647 // 가독성을 위해

    println(i) // 2147483647
    println(i + 1) // -2147483648
    println(l + 1) // -9223372036854775808

    val aa = 1000 // Int
    val bb = 1000L // Long
    val cc = 1000.0 // Double
}
