package assu.study.kotlinme.chap02

fun main() {
    val map = mapOf('a' to "aaa")
    println(map['b']) // null
    // println(map.getValue('b'))  // runtime error: NoSuchElementException

    println(map.getOrDefault('a', "bb")) // aaa
    println(map.getOrDefault('b', "bb")) // bb
}
