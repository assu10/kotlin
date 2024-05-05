package assu.study.kotlinme.chap07.extensionLambdas

fun Int.d1(f: (Int) -> Int) = f(this) * 10

fun Int.d2(f: Int.() -> Int) = f(this) * 10

fun f1(n: Int) = n + 3

fun Int.f2() = this + 3

fun main() {
    val result1 = 11.d1(::f1)
    val result2 = 11.d2(::f1)
    val result3 = 11.d1(Int::f2)
    val result4 = 11.d2(Int::f2)

    println(result1) // 140
    println(result2) // 140
    println(result3) // 140
    println(result4) // 140
}
