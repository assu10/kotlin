package assu.study.kotlinme.chap04.manipulatingLists

fun main() {
    val left = listOf('a', 'b', 'c', 'd')
    val right = listOf('q', 'r', 's')

    // left 와 right 를 zipping 하면 Pair 로 이루어진 List 가 반환됨
    val result1 = left.zip(right)

    // [(a, q), (b, r), (c, s)]
    println(result1)

    val result2 = left.zip(0..5)

    // [(a, 0), (b, 1), (c, 2), (d, 3)]
    println(result2)

    val result3 = (10..100).zip(right)

    // [(10, q), (11, r), (12, s)]
    println(result3)
}
