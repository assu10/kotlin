package assu.study.kotlinme.chap02

import eq

fun main() {
    val ints = listOf(1, 3, 2, 4, 5)
    ints eq "[1, 3, 2, 4, 5]"

    // 각 원소 이터레이션
    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "1 3 2 4 5"

    // List 원소 인덱싱
    ints[4] eq 5

    // outbounds
    //   ints[5]

    val strings = listOf("a", "c", "b")
    println(strings) // [a, c, b]
    println(strings.sorted()) // [a, b, c]
    println(strings.reversed()) // [b, c, a]
    println(strings.first()) // a
    println(strings.takeLast(2)) // [c, b]
}
