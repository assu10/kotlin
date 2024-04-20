package assu.study.kotlinme.chap05.abstract

interface AA {
    abstract val x: Int

    abstract fun f(): Int

    abstract fun g(n: Double)
}

// AA 와 동일
interface BB {
    val x: Int

    fun f(): Int

    fun g(n: Double)
}
