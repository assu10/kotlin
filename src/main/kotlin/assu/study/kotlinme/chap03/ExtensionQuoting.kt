package assu.study.kotlinme.chap03

fun String.singleQuota() = "'$this'"

fun String.doubleQuota() = "\"$this\""

fun main() {
    val single = "Hello".singleQuota()
    val double = "Hello".doubleQuota()

    println(single) // 'Hello'
    println(double) // "Hello"
}
