package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)

    // 람다를 이름없는 인자로 호출
    val result = list.joinToString(" ") { "[$it]" }
    println(result) // [1] [2] [3] [4]

    // 람다를 이름 붙은 인자로 호출할 때는 인자 목록을 감싸는 괄호 안에 람다를 위치시켜야 함
    val result2 = list.joinToString(
        separator = " ",
        transform = { "[$it]" }
    )
    println(result2)    // [1] [2] [3] [4]
}