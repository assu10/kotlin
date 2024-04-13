package assu.study.kotlinme.chap04.recursion

// fibonacci2(n) 가 Local 함수로 선언된 tail recursion 함수인 fibonacciRec() 을 가려주기 때문에
// 외부에서는 오직 fibonacci2(n) 만 호출 가능
fun fibonacci2(n: Int): Long {
    tailrec fun fibonacciRec(
        n: Int,
        current: Long,
        next: Long,
    ): Long {
        if (n == 0) return current
        return fibonacciRec(n - 1, next, current + next)
    }
    return fibonacciRec(n, 0L, 1L)
}

fun main() {
    val result1 = (0..8).map { fibonacci2(it) }
    // [0, 1, 1, 2, 3, 5, 8, 13, 21]
    println(result1)

    println(fibonacci2(22)) // 17711
    println(fibonacci2(50)) // 12586269025
}
