package assu.study.kotlinme.chap04.manipulatingLists

fun main() {
    val intRange = 1..3

    // map() 은 intRange 에 속한 각 원소에 대응하는 3가지 List 의 정보를 유지
    val result1 =
        intRange.map { a ->
            intRange.map { b -> a to b }
        }

    // [[(1, 1), (1, 2), (1, 3)], [(2, 1), (2, 2), (2, 3)], [(3, 1), (3, 2), (3, 3)]]
    println(result1)

    // flatten() 을 이용하여 결과를 펼처서 단일 List 생성
    // 하지만 이런 작업을 해야 하는 경우가 빈번하므로 코틀린은 한번 호출하면 map() 과 flatten() 을 모두 수행해주는 flatMap() 이라는 합성 연산을 제공함
    val result2 =
        intRange.map { a ->
            intRange.map { b -> a to b }
        }.flatten()

    // [(1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)]
    println(result2)

    // flatMap() 사용
    val result3 =
        intRange.flatMap { a ->
            intRange.map { b -> a to b }
        }

    // [(1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)]
    println(result3)
}
