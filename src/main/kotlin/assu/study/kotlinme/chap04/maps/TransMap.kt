package assu.study.kotlinme.chap04.maps

fun main() {
    val even = mapOf(2 to "two", 4 to "four")

    // map() 사용, List 반환
    // map() 은 Map.Entry 인자를 받는 람다를 파라메터로 받음
    // Map.Entry 의 내용을 it.key, it.value 로 접근 가능
    val result1 = even.map { "${it.key}=${it.value}" }

    // [2=two, 4=four]
    println(result1)

    // 구조 분해 사용
    val result2 = even.map { (key1, value1) -> "$key1=$value1" }

    // [2=two, 4=four]
    println(result2)

    // 파라메터를 사용하지 아낳을 때는 밑줄을 사용하여 컴파일러 경고를 막음
    // mayKeys(), mapValues() 는 모든 key 나 value 가 변환된 새로운 Map 을 반환함
    val result3 =
        even.mapKeys { (num, _) -> -num }
            .mapValues { (_, str) -> "minus $str" }

    // {-2=minus two, -4=minus four}
    println(result3)

    // map() 사용
    // map() 은 List 를 반환하므로 새로운 Map 을 생성하려면 명시적으로 toMap() 을 호출해야 함
    val result4 =
        even.map { (key, value) -> -key to "minus $value" }
            .toMap()

    // {-2=minus two, -4=minus four}
    println(result4)
}
