package assu.study.kotlinme.chap04.manipulatingLists

fun main() {
    val list =
        listOf(
            listOf(1, 2),
            listOf(3, 4),
            listOf(5, 6),
        )

    val result = list.flatten()

    // [1, 2, 3, 4, 5, 6]
    println(result)
}
