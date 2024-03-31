package assu.study.kotlinme.chap03.safecallandelvis

// 확장 함수
fun String.echo() {
    println(uppercase())
    println(this)
    println(lowercase())
}

fun main() {
    val s1: String? = "Abcde"

    // 컴파일 오류
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // s1.echo()

    // 안전한 호출인 ?. 사용
    s1?.echo()
    // ABCDE
    // Abcde
    // abcde

    val s2: String? = null

    // 안전한 호출인 ?. 사용
    // s2 의 수신 객체가 null 이므로 아무 일도 수행하지 않음
    s2?.echo()
}
