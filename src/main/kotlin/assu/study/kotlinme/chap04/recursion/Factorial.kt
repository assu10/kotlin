package assu.study.kotlinme.chap04.recursion

fun factorial(n: Long): Long {
    if (n <= 1) return 1
    return n * factorial(n - 1)
}

fun main() {
    println(factorial(5)) // 120
    println(factorial(17)) // 355687428096000
}
