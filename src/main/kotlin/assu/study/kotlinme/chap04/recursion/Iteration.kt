package assu.study.kotlinme.chap04.recursion

fun customSum2(n: Long): Long {
    var acc = 0L
    for (i in 1..n) {
        acc += i
    }
    return acc
}

fun main() {
    println(customSum2(10_000L)) // 50005000
    println(customSum2(100_000L)) // 5000050000
}
