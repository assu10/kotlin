package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf(1, 2, 3, 4)

    // 람다를 변수에 담아서 사용
    val isEven = { e: Int -> e % 2 == 0 }

    val result = list.filter(isEven)

    // any() 는 주어진 Predicate 를 만족하는 원소가 List 에 하나라도 있는지 검사함
    val result2 = list.any(isEven)

    println(result) // [2, 4]
    println(result2)    // true
}