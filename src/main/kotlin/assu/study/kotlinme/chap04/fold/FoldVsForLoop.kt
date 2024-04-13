package assu.study.kotlinme.chap04.fold

fun main() {
    val list = listOf(1, 2, 3)

    var acc = 0
    var operation = { sum: Int, i: Int -> sum + i }

    for (i in list) {
        acc = operation(acc, i)
    }
    println(acc) // 6
}
