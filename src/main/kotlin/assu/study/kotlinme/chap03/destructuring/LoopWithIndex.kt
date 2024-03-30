package assu.study.kotlinme.chap03.destructuring

fun main() {
    val list = listOf('a', 'b', 'c')
    // 0:a
    // 1:b
    // 2:c
    for ((index, value) in list.withIndex()) {
        println("$index:$value")
    }
}
