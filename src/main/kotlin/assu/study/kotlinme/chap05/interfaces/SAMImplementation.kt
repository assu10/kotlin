package assu.study.kotlinme.chap05.interfaces

// 단일 추상 메서드(SAM) 인터페이스
fun interface ZeroArg1 {
    fun f(): Int
}

// 단일 추상 메서드(SAM) 인터페이스
fun interface OneArg1 {
    fun g(n: Int): Int
}

// 단일 추상 메서드(SAM) 인터페이스
fun interface TwoArg1 {
    fun h(
        i: Int,
        j: Int,
    ): Int
}

// 클래스로 SAM 구현
class VerboseZero : ZeroArg1 {
    override fun f() = 11
}

val verboseZero = VerboseZero()

// 람다로 SAM 구현
val samZero = ZeroArg1 { 11 }

// 클래스로 SAM 구현
class VerboseOne : OneArg1 {
    override fun g(n: Int) = n + 11
}

val verboseOne = VerboseOne()

// 람다로 SAM 구현
val samOne = OneArg1 { it + 11 }

// 클래스로 SAM 구현
class VerboseTwo : TwoArg1 {
    override fun h(
        n: Int,
        j: Int,
    ) = n + j
}

val verboseTwo = VerboseTwo()

// 람다로 SAM 구현
val samTwo = TwoArg1 { i, j -> i + j }

fun main() {
    println(verboseZero) // assu.study.kotlinme.chap05.VerboseZero@2f4d3709
    println(verboseZero.f()) // 11

    println(samZero) // assu.study.kotlinme.chap05.SAMImplementationKt$$Lambda$15/0x0000000132003000@4e50df2e
    println(samZero.f()) // 11

    println(verboseOne.g(2)) // 13
    println(samOne.g(2)) // 13

    println(verboseTwo.h(1, 2)) // 3
    println(samTwo.h(1, 2)) // 3
}
