package assu.study.kotlinme.chap07.usingOperators

fun main() {
    var list = listOf(1, 2) // 가변 컬렉션
    val initial = list

    list += 3

    // 기존 컬렉션 내용을 변경함
    println(list) // [1, 2, 3]

    list = list.plus(4)
    println(list) // [1, 2, 3, 4]

    // 컬렉션이 변경되지 않고 그대로 있음
    println(initial) // [1, 2]
}
