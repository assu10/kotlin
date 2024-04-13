package assu.study.kotlinme.chap04.localFunctions

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""

    list.forEach {
        // return 을 포함하는 람다
        result += it
        if (it == value) {
            return@forEach // 레이블이 붙은 return
        }
    }

    println(result) // 12345
}
