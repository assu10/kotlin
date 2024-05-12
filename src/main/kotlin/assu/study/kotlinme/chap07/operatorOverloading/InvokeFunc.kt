package assu.study.kotlinme.chap07.operatorOverloading

fun main() {
    val func: (String) -> Int = { it.length }

    val result1 = func("abc")
    val result2 = func.invoke("abc")

    println(result1) // 3
    println(result2) // 3

    val nullableFunc: ((String) -> Int)? = null

    var result3 = 0
    if (nullableFunc != null) {
        result3 = nullableFunc("abc")
    }

    val result4 = nullableFunc?.invoke("abc")

    println(result3) // 0
    println(result4) // null
}
