package assu.study.kotlinme.chap03.dataclass

data class Simple(
    val arg1: String,
    var arg2: Int,
)

fun main() {
    val s1 = Simple("A", 1)
    val s2 = Simple("A", 1)

    println(s1) // Simple(arg1=A, arg2=1)
    println(s2) // Simple(arg1=A, arg2=1)
    println(s1.equals(s2)) // true
    println(s1 == s2) // true
}
