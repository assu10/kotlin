package assu.study.kotlinme.chap07.usingOperators

fun main() {
    var list = listOf(1, 2) // 가변 컬렉션
    list += 3

    // Int 처럼 간단한 타입은 기존 컬렉션 내용을 변경함
    println(list) // [1, 2, 3]
}
