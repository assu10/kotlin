package assu.study.kotlinme.chap06.nothingType

fun later(s: String): String = TODO("later()~")

fun later2(s: String): Int = TODO()

fun main() {
    // Exception in thread "main" kotlin.NotImplementedError: An operation is not implemented: later()~
    // later("hello")

    // Exception in thread "main" kotlin.NotImplementedError: An operation is not implemented.
    later2("hello")
}
