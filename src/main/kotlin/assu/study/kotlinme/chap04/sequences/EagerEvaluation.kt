package assu.study.kotlinme.chap04.sequences

fun main() {
    val list = listOf(1, 2, 3, 4)

    // List 에 filter(), map(), any() 를 연쇄 적용함
    val result =
        list.filter { it % 2 == 0 }
            .map { it * it }
            .any { it < 10 }

    println(result) // true

    // 위의 연쇄 적용한 것은 아래와 같음
    val mid1 = list.filter { it % 2 == 0 }
    println(mid1) // [2, 4]
    val mid2 = mid1.map { it * it }
    println(mid2) // [4, 16]
    val mid3 = mid2.any { it < 10 }
    println(mid3) // true
}
