package assu.study.kotlinme.chap04.localFunctions

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""

    // 람다 앞에 커스텀 레이블을 붙임
    list.forEach customTag@{
        result += it
        println("$it, $value, $result")
        if (it == value) {
            println("haha")
            return@customTag // main() 이 아닌 람다를 반환함
        }
    }

    // 1, 3, 1
    // 2, 3, 12
    // 3, 3, 123
    // haha
    // 4, 3, 1234
    // 5, 3, 12345
    // 12345
    println(result)
}
