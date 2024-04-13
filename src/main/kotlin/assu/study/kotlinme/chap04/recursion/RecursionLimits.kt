package assu.study.kotlinme.chap04.recursion

tailrec fun customSum(n: Long): Long {
    if (n == 0L) return 0
    return n + customSum(n - 1)
}

fun main() {
    println(customSum(3)) // 6

    println(customSum(1_000)) // 500500

    // Exception in thread "main" java.lang.StackOverflowError
    // 	at assu.study.kotlinme.chap04.recursion.RecursionLimitsKt.customSum(RecursionLimits.kt:5)
    // 	at assu.study.kotlinme.chap04.recursion.RecursionLimitsKt.customSum(RecursionLimits.kt:5)

    // println(customSum(100_000))

    // 위와 비교하기 위해 범위의 합계를 구해주는 표준 라이브러리 함수 sum() 사용, 이 때는 정상적인 값을 내놓음
    println((1..100_000L).sum()) // 5000050000
}
