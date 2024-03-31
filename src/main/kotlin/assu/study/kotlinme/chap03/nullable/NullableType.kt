package assu.study.kotlinme.chap03.nullable

fun main() {
    // null 참조 아님
    val s1 = "abc"

    // 컴파일 오류 (Null can not be a value of a non-null type String)
    // null 이 될 수 없는 타입인 String 타입의 값으로 null 지정 불가
    // val s2:String = null

    // null 이 될 수 있는 변수들
    val s3: String? = null
    val s4: String? = s1

    // 컴파일 오류
    // null 이 될 수 있는 타입의 식별자를 null 이 될 수 없는 타입의 식별자에 대입 불가
    // val s5: String = s4

    // 타입 추론을 하면 코틀린이 적당한 타입을 만들어 냄
    // s4 가 nullable 이므로 s6 도 nullable 타입이 됨
    val s6 = s4
}
