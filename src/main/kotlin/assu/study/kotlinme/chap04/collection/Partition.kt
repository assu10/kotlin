package assu.study.kotlinme.chap04.collection

fun main() {
    val list = listOf(-3, -1, 0, 5, 7)
    val isPositive = { i: Int -> i > 0 }

    // filter(), filterNot()
    val result1 = list.filter(isPositive)
    val result2 = list.filterNot(isPositive)

    println(result1) // [5, 7]
    println(result2) // [-3, -1, 0]

    // partition()
    val (pos, neg) = list.partition(isPositive)
    val (pos1, neg1) = list.partition { it > 0 }

    println(pos) // [5, 7]
    println(neg) // [-3, -1, 0]
    println(pos1) // // [5, 7]
    println(neg1) // [-3, -1, 0]
}
