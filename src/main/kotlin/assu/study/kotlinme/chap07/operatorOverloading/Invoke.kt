package assu.study.kotlinme.chap07.operatorOverloading

class Func {
    operator fun invoke() = "invoke()~"

    operator fun invoke(i: Int) = "invoke($i)~"

    operator fun invoke(
        i: Int,
        s: String,
    ) = "invoke($i, $s)~"

    operator fun invoke(
        i: Int,
        s: String,
        d: Double,
    ) = "invoke($i, $s, $d)~"

    // 가변 인자 목록 사용
    operator fun invoke(
        i: Int,
        vararg v: String,
    ) = "invoke($i, ${v.map { it }})~"
}

fun main() {
    val f = Func()

    val result1 = f()
    val result2 = f(1)
    val result3 = f(1, "a")
    val result4 = f(1, "a", 2.2)
    val result5 = f(1, "a", "b", "c")

    println(result1) // invoke()~
    println(result2) // invoke(1)~
    println(result3) // invoke(1, a)~
    println(result4) // invoke(1, a, 2.2)~
    println(result5) // invoke(1, [a, b, c])~
}
