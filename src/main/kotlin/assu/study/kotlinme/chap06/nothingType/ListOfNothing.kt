package assu.study.kotlinme.chap06.nothingType

fun main() {
    val none: Nothing? = null

    var nullableString: String? = null
    nullableString = "aaa"
    nullableString = none
    println(nullableString) // null

    val nullableInt: Int? = none
    println(nullableInt) // null

    // null 값만 있는 List 로 초기화
    val listNone: List<Nothing?> = listOf(null)
    val ints: List<Int?> = listOf(null)
    println(listNone) // [null]
    println(ints) // [null]
}
