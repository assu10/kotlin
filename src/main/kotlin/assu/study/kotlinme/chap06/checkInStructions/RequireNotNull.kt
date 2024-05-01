package assu.study.kotlinme.chap06.checkInStructions

fun checkNotNull(n: Int?): Int {
    // null 일 경우 직접 리턴 메시지 조작
    requireNotNull(n) {
        "checkNotNull() argument cannot be null~"
    }

    // requireNotNull() 호출이 n 을 null 이 될 수 업을 값으로 스마트캐스트 해주므로
    // n 에 대해 더 이상 null 검사를 할 필요가 없음
    return n * 9
}

fun main() {
    val n: Int? = null

    // Exception in thread "main" java.lang.IllegalArgumentException: checkNotNull() argument cannot be null~
    // val result1 = checkNotNull(n)

    // null 일 경우 디폹 메시지 사용
    // Exception in thread "main" java.lang.IllegalArgumentException: Required value was null.
    // val result2 = requireNotNull(n)

    val result3 = checkNotNull(1)
    println(result3) // 9
}
