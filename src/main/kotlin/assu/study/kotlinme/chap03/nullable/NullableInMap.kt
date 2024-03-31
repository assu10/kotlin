package assu.study.kotlinme.chap03.nullable

fun main() {
    val map = mapOf(0 to "yes", 1 to "no")

    // 컴파일 오류
    // val first: String = map[0]

    val first: String? = map[0]
    val second: String? = map[2]

    println(first) // yes
    println(second) // null
}
