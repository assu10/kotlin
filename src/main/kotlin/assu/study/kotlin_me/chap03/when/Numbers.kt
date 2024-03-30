package assu.study.kotlin_me.chap03.`when`

val numbers = mapOf(
    1 to "one", 2 to "two",
    3 to "three", 4 to "four"
)

fun ordinal(i: Int): String =
    when (i) {
        1 -> "oneone"
        2 -> "twotwo"
        3 -> "threethree"
        else -> numbers.getValue(i) + "haha"
    }

fun main() {
    val result1 = ordinal(2)
    val result2 = ordinal(4)

    println(result1)    // twotwo
    println(result2)    // fourhaha
}