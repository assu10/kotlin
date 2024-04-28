package assu.study.kotlinme.chap05.companionObjects

class WithNamed {
    companion object Aaa {
        fun s() = "from Aaa~"
    }
}

class WithDefault {
    companion object {
        fun s() = "from Default~"
    }
}

fun main() {
    val result1 = WithNamed.s()
    val result2 = WithNamed.Aaa.s()
    val result3 = WithDefault.s()

    // 디폴트 이름은 Companion 임
    val result4 = WithDefault.Companion.s()

    println(result1) // from Aaa~
    println(result2) // from Aaa~
    println(result3) // from Default~
    println(result4) // from Default~
}
