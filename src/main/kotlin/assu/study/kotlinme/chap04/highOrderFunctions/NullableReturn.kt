package assu.study.kotlinme.chap04.highOrderFunctions

fun main() {
    // 리턴값이 null 이 될 수도 있음
    val trans: (String) -> Int? =
        { s: String -> s.toIntOrNull() }

    val result1 = trans("123")
    val result2 = trans("abc")

    println(result1) // 123
    println(result2) // null

    val x = listOf("123", "abc")
    val result3 = x.mapNotNull(trans)
    val result4 = x.mapNotNull { it.toIntOrNull() }
    println(result3) // [123]
    println(result4) // [123]
}
