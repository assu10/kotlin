package assu.study.kotlinme.chap02

fun evaluate(vararg ints: Int) =
    "Size: ${ints.size}\n" +
        "Sum: ${ints.sum()}\n" +
        "Average: ${ints.average()}\n"

fun main() {
    var result = evaluate(1, -1, 1, 2, 3)
    println(result)
}
