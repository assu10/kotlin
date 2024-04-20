package assu.study.kotlinme.chap05.abstract

interface PropertyAccessor {
    val a: Int
        get() = 1
}

class Impl : PropertyAccessor

fun main() {
    println(Impl().a) // 1
}
