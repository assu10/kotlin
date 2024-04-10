package assu.study.kotlinme.chap04.highOrderFunctions

fun customRepeat(
    times: Int,
    action: (Int) -> Unit, // (Int) -> Unit 타입의 함수를 action 파라메터로 받음
) {
    for (index in 0 until times) {
        action(index) // 현재의 반복 횟수를 index 를 사용하여 호출
    }
}

fun main() {
    val result = customRepeat(3, { println("#$it") })
    val result2 = customRepeat(3) { println("#$it") }

    // #0
    // #1
    // #2
    println(result)
    // #0
    // #1
    // #2
    println(result2)
}
