package assu.study.kotlinme.chap03.nullableExtentions

fun main() {
    val s1: String? = null
    println(s1.isNullOrEmpty()) // true
    println(s1.isNullOrBlank()) // true

    val s2 = ""
    println(s2.isNullOrEmpty()) // true
    println(s2.isNullOrBlank()) // true

    val s3 = "  \t\n"
    println(s3.isNullOrEmpty()) // false
    println(s3.isNullOrBlank()) // true

    val s4 = "abc"
    println(s4.isNullOrEmpty()) // false
    println(s4.isNullOrBlank()) // false
}
