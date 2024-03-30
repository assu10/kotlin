package assu.study.kotlinme.chap02

fun first(vararg numbers: Int): String {
    var result = ""
    for (i in numbers) {
        result += i
    }
    return result
}

// fun second(vararg numbers: Int) = first(numbers) 오류
fun second(vararg numbers: Int) = first(*numbers)

fun main() {
    val result = second(1, 2, 3)

    println(result) // 123
}
