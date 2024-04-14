package assu.study.kotlinme.chap05

// 단일 추상 메서드(SAM) 인터페이스
fun interface ZeroArg {
    fun f(): Int
}

// 단일 추상 메서드(SAM) 인터페이스
fun interface OneArg {
    fun g(n: Int): Int
}

// 단일 추상 메서드(SAM) 인터페이스
fun interface TwoArg {
    fun h(
        i: Int,
        j: Int,
    ): Int
}
