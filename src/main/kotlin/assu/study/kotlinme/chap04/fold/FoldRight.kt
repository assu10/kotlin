package assu.study.kotlinme.chap04.fold

fun main() {
    var list = listOf('a', 'b', 'c', 'd')

    // fold() 사용
    val result = list.fold("*") { acc, ele -> "($acc) + $ele" }

    // ((((*) + a) + b) + c) + d
    println(result)

    // foldRight() 사용
    val result1 = list.foldRight("*") { elem, acc -> "($acc) + $elem" }

    // ((((*) + d) + c) + b) + a
    println(result1)
}
