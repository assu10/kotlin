package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)
    // {} 안의 내용이 람다
    val result = list.map { n: Int -> "[$n]" }

    // 람다의 타입을 추론
    // 람다를 List<Int> 타입에서 사용하고 있기 때문에 코틀린은 n 의 타입이 Int 라는 사실을 알 수 있음
    var result2 = list.map { n -> "[$n]" }

    println(list)   // [1, 2, 3, 4]
    println(result) // [[1], [2], [3], [4]]
    println(result2)    // [[1], [2], [3], [4]]
}
