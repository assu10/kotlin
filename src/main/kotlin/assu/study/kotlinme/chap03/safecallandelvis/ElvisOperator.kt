package assu.study.kotlinme.chap03.safecallandelvis

fun main() {
    val s1: String? = "abc"

    // s1 이 null 이 아니므로 abc 출력
    println(s1 ?: "ddd") // abc

    val s2: String? = null

    // s2 가 null 이므로 ddd 출력
    println(s2 ?: "ddd") // ddd
}
