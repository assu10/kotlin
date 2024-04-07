package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)
    val divider = 2

    // 람다가 자신의 밖에 정의된 divider 를 포획(capture) 함
    // 람다는 capture 한 요소를 읽거나 변경 가능
    val result = list.filter { it % divider == 0 }

    println(result) // [2, 4]
}