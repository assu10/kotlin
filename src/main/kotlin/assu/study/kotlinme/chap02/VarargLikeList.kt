package assu.study.kotlinme.chap02

fun evaluate(vararg ints: Int) =
    "Size: ${ints.size}\n" +
        "Sum: ${ints.sum()}\n" +
        "Average: ${ints.average()}\n"

fun evaluate2(ints: List<Int>) =
    "Size: ${ints.size}\n" +
        "Sum: ${ints.sum()}\n" +
        "Average: ${ints.average()}\n"

fun main() {
    val result1 = evaluate(1, -1, 1, 2, 3)

    // Size: 5
    // Sum: 6
    // Average: 1.2
    println(result1)

    // 컴파일 오류
//    val result2 = evaluate2(1, -1, 1, 2, 3)
//    println(result2)

    // 컴파일 오류
//    val result3 = evaluate(listOf(1, -1, 1, 2, 3))
//    println(result3)

    val result4 = evaluate2(listOf(1, -1, 1, 2, 3))

    // Size: 5
    // Sum: 6
    // Average: 1.2
    println(result4)
}
