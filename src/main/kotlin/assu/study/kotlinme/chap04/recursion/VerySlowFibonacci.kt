package assu.study.kotlinme.chap04.recursion

// 일반 재귀로 표현한 피보나치
fun fibonacci(n: Long): Long {
    return when (n) {
        0L -> 0
        1L -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}

fun main() {
    println(fibonacci(0)) // 0
    println(fibonacci(22)) // 17711
}
