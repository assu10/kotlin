package assu.study.kotlinme.chap03.nullable

fun main() {
    val s1: String = "abc"
    val s2: String? = s1
    val s3: String? = null
    val s4: String? = "abc"

    println(s1.length) // 3

    // 컴파일 오류
    // nullable 타입의 멤버는 참조 불가
    // println(s2.length)

    if (s2 != null) {
        println(s2.length) // 3
    }

    // 컴파일 오류
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // String? 타입의 nullable 수신 객체에는 안전한 (?.) 호출이나 널이 아닌 단언(!!.) 호출만 가능
    // println(s3.length)

    // 컴파일 오류
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // String? 타입의 nullable 수신 객체에는 안전한 (?.) 호출이나 널이 아닌 단언(!!.) 호출만 가능
    // println(s4.length)
}
