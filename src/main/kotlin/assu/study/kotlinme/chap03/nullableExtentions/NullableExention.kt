package assu.study.kotlinme.chap03.nullableExtentions

// this 를 사용한 확장 함수 표현
fun String?.isNullOrEmpty(): Boolean = this == null || isEmpty()

fun main() {
    println(null.isNullOrEmpty()) // true
    println("".isNullOrEmpty()) // true
}
