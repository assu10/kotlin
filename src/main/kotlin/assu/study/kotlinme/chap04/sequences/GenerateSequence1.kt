package assu.study.kotlinme.chap04.sequences

fun main() {
    val naturalNumbers = generateSequence(1) { it + 1 }

    // take() 를 통해 원하는 개수만큰 얻은 후 최종 연산 (toList(), sum()) 수행
    val result1 = naturalNumbers.take(3).toList()
    val result2 = naturalNumbers.take(3).sum()

    println(result1) // [1, 2, 3]
    println(result2) // 6
}
