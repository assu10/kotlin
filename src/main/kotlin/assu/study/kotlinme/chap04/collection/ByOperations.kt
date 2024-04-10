package assu.study.kotlinme.chap04.collection

data class Product(
    val desc: String,
    val price: Double,
)

fun main() {
    val products =
        listOf(
            Product("paper", 2.0),
            Product("pencil", 7.0),
        )

    val result1 = products.sumOf { it.price }
    println(result1) // 9.0

    val result2 = products.sortedByDescending { it.price }
    println(result2) // [Product(desc=pencil, price=7.0), Product(desc=paper, price=2.0)]

    val result3 = products.minByOrNull { it.price }
    println(result3) // Product(desc=paper, price=2.0)
}
