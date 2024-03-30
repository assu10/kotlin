package assu.study.kotlinme.chap03.destructuring

fun main() {
    var result = ""
    val map = mapOf(1 to "one", 2 to "two")
    for ((key, value) in map) {
        result += "$key = $value,"
    }
    // 1 = one,2 = two,
    println(result)

    result = ""
    val listOfPairs = listOf(Pair(1, "one"), Pair(2, "two"))
    for ((i, s) in listOfPairs) {
        result += "($i, $s),"
    }
    // (1, one),(2, two),
    println(result)
}
