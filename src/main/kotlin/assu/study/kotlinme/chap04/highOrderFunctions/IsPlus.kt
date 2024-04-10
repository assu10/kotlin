package assu.study.kotlinme.chap04.highOrderFunctions

// 람다를 저장한 변수의 타입이 함수 타입임
val isPlus: (Int) -> Boolean = { it > 0 }

fun main() {
    val result = listOf(1, 2, -3).any(isPlus)
    println(result) // true
}
