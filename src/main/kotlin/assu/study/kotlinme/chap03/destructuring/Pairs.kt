package assu.study.kotlinme.chap03.destructuring

fun compute(input: Int): Pair<Int, String> =
    if (input > 5) {
        Pair(input * 2, "High")
    } else {
        Pair(input * 2, "Low")
    }

fun main() {
    println(compute(7)) // (14, High)
    println(compute(3)) // (6, Low)

    // Pair 의 값을 first, second 로 가져옴
    val result = compute(5)
    println(result.first) // 10
    println(result.second) // Low

    // 구조 분해 선언을 사용하여 여러 값을 동시에 가져옴
    val (value, desc) = compute(7)
    println(value) // 14
    println(desc) // High
}
