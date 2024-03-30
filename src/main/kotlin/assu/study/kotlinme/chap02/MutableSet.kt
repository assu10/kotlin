package assu.study.kotlinme.chap02

fun main() {
    val mutableSet = mutableSetOf<Int>()
    mutableSet += 1
    mutableSet += 3
    println(mutableSet) // [1,3]
    mutableSet -= 1
    println(mutableSet) // [1]
}
