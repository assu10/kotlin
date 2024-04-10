package assu.study.kotlinme.chap04.collection

fun main() {
    val set = setOf("a", "ab", "ac")

    // maxByOrNull()
    // 컬렉션이 비어있으면 null 을 반환하기 때문에 결과 타입이 null 이 될 수 있는 타입임
    val result1 = set.maxByOrNull { it.length }?.length
    println(result1) // 2

    // filter()
    val result2 =
        set.filter {
            it.contains('b')
        }
    println(result2) // [ab]

    // map()
    val result3 = set.map { it.length }
    println(result3) // [1, 2, 2]
}
