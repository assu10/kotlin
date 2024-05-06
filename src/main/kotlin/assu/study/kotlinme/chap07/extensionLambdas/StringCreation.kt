package assu.study.kotlinme.chap07.extensionLambdas

// StringBuilder 로 문자열 생성
private fun messy(): String {
    // StringBuilder 생성
    val built = StringBuilder()

    built.append("ABCs: ")

    // a~x 까지의 문자열을 덧붙임
    ('a'..'x').forEach { built.append(it) }

    // 결과 생성
    return built.toString()
}

// buildString() 으로 문자열 생성
// append() 호출의 수신 책게를 직접 만들고 관리할 필요가 없음
private fun clean(): String =
    buildString {
        append("ABCs: ")
        ('a'..'x').forEach { append(it) }
    }

// joinToString() 으로 문자열 생성
private fun cleaner(): String = ('a'..'x').joinToString(separator = "", prefix = "ABCs: ")

fun main() {
    val result1 = messy()
    val result2 = clean()
    val result3 = cleaner()

    // 모두 동일한 결과
    // ABCs: abcdefghijklmnopqrstuvwx
    println(result1)
    println(result2)
    println(result3)
}
