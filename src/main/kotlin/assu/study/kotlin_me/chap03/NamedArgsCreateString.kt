package assu.study.kotlin_me.chap03

fun main() {
    val list = listOf(1, 2, 3)

    // 각 파라메터가 무엇을 의미하는지 알 수 없어서 비실용적인 코드
    var list1 = list.joinToString(". ", "", "!")

    // 각 파라메터의 의미가 확실하여 실용적인 코드
    var list2 = list.joinToString(separator = ". ", postfix = "!")

    println(list)   // [1, 2, 3]
    println(list1)  // 1. 2. 3!
    println(list2)  // 1. 2. 3!
}