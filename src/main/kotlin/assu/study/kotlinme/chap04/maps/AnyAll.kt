package assu.study.kotlinme.chap04.maps

fun main() {
    val map = mapOf(1 to "one", -2 to "minus two")

    val result1 = map.any { (key, _) -> key < 0 }
    val result2 = map.all { (key, _) -> key < 0 }
    val result3 = map.maxByOrNull { it.key }?.value

    println(result1) // true
    println(result2) // false
    println(result3) // one
}
