package assu.study.kotlinme.chap03.`when`

fun mixColors(
    first: String,
    second: String,
) = when (setOf(first, second)) {
    setOf("red", "blue") -> "one"
    setOf("red", "yellow") -> "two"
    else -> "unknown"
}

fun main() {
    val result1 = mixColors("red", "blue")
    val result2 = mixColors("red", "red")

    println(result1) // one
    println(result2) // unknown
}
