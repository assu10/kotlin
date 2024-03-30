package assu.study.kotlinme.chap02

fun getList(
    s: String,
    vararg a: Int,
) {}

fun sum(vararg numbers: Int): Int {
    var total = 0
    for (n in numbers) {
        total += n
    }
    return total
}

fun main() {
    getList("abc", 1, 2, 3)
    getList("abc")
    getList("abc", 1)

    println(getList("abc", 1, 2, 3))
    println(getList("abc"))
    println(getList("abc", 1))

    println(sum(1, 2)) // 3
    println(sum(1, 2, 3)) // 6
}
