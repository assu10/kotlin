package assu.study.kotlinme.chap03.overloading

// 오버로딩하지 않고 각각의 함수를 만든 경우
fun addInt(
    i: Int,
    j: Int,
) = i + j

fun addDouble(
    i: Double,
    j: Double,
) = i + j

// add 함수를 오버로딩한 경우
fun add(
    i: Int,
    j: Int,
) = i + j

fun add(
    i: Double,
    j: Double,
) = i + j

fun main() {
    val result1 = addInt(1, 2)
    val result2 = add(1, 2)

    val result3 = addDouble(1.1, 2.2)
    var result4 = add(1.1, 2.2)

    println(result1) // 3
    println(result2) // 3
    println(result3) // 3.3000000000000003
    println(result4) // 3.3000000000000003
}
