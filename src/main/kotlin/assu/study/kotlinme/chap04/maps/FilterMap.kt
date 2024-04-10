package assu.study.kotlinme.chap04.maps

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")

    // filterKeys() 사용
    val result1 = map.filterKeys { it % 2 == 1 }

    // {1=one, 3=three}
    println(result1)

    // filterValues() 사용
    val result2 = map.filterValues { it.contains('o') }

    // {1=one, 2=two, 4=four}
    println(result2)

    // Map 에 filter() 사용
    val result3 =
        map.filter { entry ->
            entry.key % 2 == 1 && entry.value.contains('o')
        }

    // {1=one}
    println(result3)
}
