package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)

    val even = list.filter { it % 2 == 0 }
    val greaterThenTwo = list.filter { it > 2 }

    println(even)   // [2, 4]
    println(greaterThenTwo) // [3, 4]
}