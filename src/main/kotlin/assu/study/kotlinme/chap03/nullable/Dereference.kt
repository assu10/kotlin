package assu.study.kotlinme.chap03.nullable

fun main() {
    val s1: String = "abc"
    val s2: String? = s1

    println(s1.length) // 3

    // 컴파일 오류
    // nullable 타입의 멤버는 참조 불가
    // println(s2.length)

    if (s2 != null) {
        println(s2.length) // 3
    }
}
