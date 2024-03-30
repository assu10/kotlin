package assu.study.kotlin_me.chap03

// singleQuota 를 2번 적용하여 작은 따옴표 2개 붙임
// this 는 String 수신 객체 타입에 속하는 객체를 가리킴
fun String.twoSingleQuota() = this.singleQuota().singleQuota()

// doubleQuota() 함수 호출 시 수신 객체(this) 생략
fun String.twoDoubleQuota() = doubleQuota().doubleQuota()

fun main() {
    val result1 = "Hello".twoSingleQuota()
    val result2 = "Hello".twoDoubleQuota()

    println(result1)    // ''Hello''
    println(result2)    // ""Hello""
}
