package assu.study.kotlinme.chap03.safecallandelvis

fun checkLength(
    s: String?,
    expected: Int?,
) {
    // if 문으로 null 검사
    val length1 =
        if (s != null) s.length else null

    // 안전한 호출 ?. 로 검사
    val length2 = s?.length

    println(length1 == expected)
    println(length2 == expected)
}

fun main() {
    checkLength("abc", 3) // true   true
    checkLength(null, null) // true  true
}
