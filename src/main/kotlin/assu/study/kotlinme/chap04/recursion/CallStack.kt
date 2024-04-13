package assu.study.kotlinme.chap04.recursion

fun illegalFunc() {
    throw IllegalStateException()
}

fun failFunc() = illegalFunc()

fun main() {
    failFunc()
}
