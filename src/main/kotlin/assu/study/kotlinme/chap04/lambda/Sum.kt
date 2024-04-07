package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)
    var sum = 0
    var divider = 2

    // 람다가 capture 한 요소인 sum 을 변경함
    val result = list.filter { it % divider == 0 }.forEach { sum += it }

    // 람다가 capture 한 요소인 sum 을 변경하지 않고 결과를 얻음
    var result2 = list.filter { it % divider == 0 }.sum()

    println(result) // kotlin.Unit
    println(result2) // 6
    println(sum)    // 6
}