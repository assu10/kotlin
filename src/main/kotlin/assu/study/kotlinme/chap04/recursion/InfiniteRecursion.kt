package assu.study.kotlinme.chap04.recursion

fun recurse(i: Int): Int = recurse(i + 1)

fun main() {
    println(recurse(1))
}
