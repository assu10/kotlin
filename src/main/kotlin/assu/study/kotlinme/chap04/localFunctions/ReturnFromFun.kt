package assu.study.kotlinme.chap04.localFunctions

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""

    list.forEach {
        // return 을 포함하는 람다
        result += it
        if (it == value) {
            return // main() 을 끝낸다는 의미
        }
    }

    println(result) // 위에서 main() 을 끝내기 때문에 아무런 출력이 되지 않음
}
