package assu.study.kotlinme.chap07.creatingGenerics

inline fun <reified T : Disposable> select() = items.filterIsInstance<T>().map { it.name }

fun main() {
    val result1 = select<Compost>()
    val result2 = select<Donation>()

    println(result1) // [AAA, BBB]
    println(result2) // [CCC, DDD]
}
