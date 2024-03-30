package assu.study.kotlinme.chap03

fun main() {
    // 리스트의 toString() 디폴트 구현은 원소를 콤마로 구분하여 반환
    val list = listOf(1, 2, 3)
    println(list) // [1, 2, 3]

    val result1 = list.joinToString()
    val result2 = list.joinToString(prefix = "(", postfix = ")")
    val result3 = list.joinToString(separator = ":")

    println(result1) // 1, 2, 3
    println(result2) // (1, 2, 3)
    println(result3) // 1:2:3
}
