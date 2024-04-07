package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf('a', 'b', 'c')
    val result = list.mapIndexed { index, ele -> "[$index:$ele]" }
    println(result) // [[0:a], [1:b], [2:c]]
}