package assu.study.kotlinme.chap04.collection

fun main() {
    // 람다는 인자로 추가할 원소의 인덱스를 받음
    val list1 = List(10) { it }
    println(list1) // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    // 하나의 값으로 이루어진 리스트
    val list2 = List(10) { 1 }
    println(list2) // [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    // 글자로 이루어진 리스트
    val list3 = List(10) { 'a' + it }
    println(list3) // [a, b, c, d, e, f, g, h, i, j]

    // 정해진 순서를 반복
    val list4 = List(10) { list3[it % 3] }
    val list5 = List(10) { list3[it % 2] }

    println(list4) // [a, b, c, a, b, c, a, b, c, a]
    println(list5) // [a, b, a, b, a, b, a, b, a, b]
}
