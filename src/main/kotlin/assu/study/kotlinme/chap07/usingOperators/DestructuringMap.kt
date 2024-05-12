package assu.study.kotlinme.chap07.usingOperators

fun main() {
    val map = mapOf("a" to 1)

    // 구조 분해 대입
    for ((key, value) in map) {
        // a -> 1
        println("$key -> $value")
    }

    // 위의 구조 분해 대입은 아래와 같음
    for (entry in map) {
        val key = entry.component1()
        val value = entry.component2()

        // a -> 1
        println("$key -> $value")
    }
}
