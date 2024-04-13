package assu.study.kotlinme.chap04.fold

fun main() {
    val list = listOf(1, 2, 3)

    val result = list.fold(0) { acc, i -> acc + i }
    println(result) // 6
}
