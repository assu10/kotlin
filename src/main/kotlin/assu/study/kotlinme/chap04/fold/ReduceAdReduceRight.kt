package assu.study.kotlinme.chap04.fold

fun main() {
    val chars = "a b c d e".split(" ")

    // fold() 사용
    val result1 = chars.fold("*") { acc, e -> "$acc, $e" }

    // *, a, b, c, d, e
    println(result1)

    // foldRight() 사용
    val result2 = chars.foldRight("*") { e, acc -> "$acc, $e" }

    // *, e, d, c, b, a
    println(result2)

    // reduce() 사용
    val result3 = chars.reduce { acc, e -> "$acc, $e" }

    // a, b, c, d, e
    println(result3)

    // reduceRight() 사용
    val result4 = chars.reduceRight { e, acc -> "$acc, $e" }

    // e, d, c, b, a
    println(result4)
}
