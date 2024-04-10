package assu.study.kotlinme.chap04.collection

fun main() {
    val mutableList1 = MutableList(5, { 10 * (it + 1) })

    // 람다가 함수의 마지막 원소이면 람다를 인자 목록 밖으로 빼내도 됨
    val mutableList2 = MutableList(5) { 10 * (it + 1) }

    println(mutableList1) // [10, 20, 30, 40, 50]
    println(mutableList2) // [10, 20, 30, 40, 50]
}
