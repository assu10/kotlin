package assu.study.kotlinme.chap04.manipulatingLists

fun main() {
    val list = listOf('a', 'b', 'c', 'd')

    val result1 = list.zipWithNext()

    // [(a, b), (b, c), (c, d)]
    println(result1)

    // 원소를 zipping 한 후 연산을 추가로 적용함
    val result2 = list.zipWithNext { a, b -> "$a$b" }

    // [ab, bc, cd]
    println(result2)
}
