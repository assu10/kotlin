package assu.study.kotlinme.chap04.recursion

// acc 파라메터를 추가하면 재귀 호출 중에 (인자 계산 시) 덧셈 가능
// 결과를 받으면 그냥 반환하는 일 말고는 또다른 연산이 없음
// 모든 연산을 재귀 함수 호출에 위임하기 때문에 tailrec 가능
// acc 가 불변값이 되므로 가변 상태의 변수도 사라짐
private tailrec fun customSum4(
    n: Long,
    acc: Long,
): Long =
    if (n == 0L) {
        acc
    } else {
        customSum4(n - 1, acc + n)
    }

fun customSum5(n: Long) = customSum4(n, 0)

fun main() {
    println(customSum5(2)) // 3
    println(customSum5(10_000)) // 50005000
    println(customSum5(100_000)) // 5000050000
}
