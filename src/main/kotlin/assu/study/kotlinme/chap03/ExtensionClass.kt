package assu.study.kotlinme.chap03

class Book(val title: String)

fun Book.categorize(category: String) = """title: "$title", category: $category"""

// 위와 동일한 기능을 함
fun categorize2(
    book: Book,
    category: String,
) = """title: "${book.title}", category: $category"""

fun main() {
    val result = Book("Assu").categorize("Silby")
    val result2 = categorize2(Book("Assu"), "Silby")

    // title: "Assu", category: Silby
    println(result)
    // title: "Assu", category: Silby
    println(result2)
}
