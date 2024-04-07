package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { "[$it]" }
    println(result) // [[1], [2], [3], [4]]

    val stringList = listOf("a", "b", "c")
    val result2 = stringList.map({ "${it.uppercase()}" })

    // 함수의 파라메터가 람다뿐이면 람다 주변의 괄호를 없앨 수 있음
    val result3 = stringList.map { "${it.uppercase()}" }
    println(result2)    // [A, B, C]
    println(result3)    // [A, B, C]
}