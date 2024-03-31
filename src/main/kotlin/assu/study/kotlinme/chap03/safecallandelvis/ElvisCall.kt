package assu.study.kotlinme.chap03.safecallandelvis

fun checkLength2(
    s: String?,
    expected: Int,
) {
    // if 문으로 null 검사
    val length1 =
        if (s != null) s.length else 0

    // 안전한 호출 ?. 과 Elvis 연산자 ?: 로 검사
    val length2 = s?.length ?: 0

    println(length1 == expected)
    println(length2 == expected)
}

fun main() {
    checkLength2("abc", 3) // true  true
    checkLength2(null, 0) // true  true
}
