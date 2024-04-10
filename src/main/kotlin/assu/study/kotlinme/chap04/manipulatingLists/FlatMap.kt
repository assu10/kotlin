package assu.study.kotlinme.chap04.manipulatingLists

class Book(
    val title: String,
    val author: List<String>,
)

fun main() {
    val books =
        listOf(
            Book("Harry", listOf("aa", "bb")),
            Book("Magic", listOf("cc", "dd")),
        )

    // map() 과 flatten() 사용
    val result1 = books.map { it.author }.flatten()

    // [aa, bb, cc, dd]
    println(result1)

    // flatMap() 사용
    val result2 = books.flatMap { it.author }

    // [aa, bb, cc, dd]
    println(result2)
}
