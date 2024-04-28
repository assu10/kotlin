package assu.study.kotlinme.chap05.companionObjects

class CompanionObjectFunctions {
    companion object {
        private var n: Int = 0

        fun incr() = ++n
    }
}

fun main() {
    println(CompanionObjectFunctions.incr()) // 1
    println(CompanionObjectFunctions.incr()) // 2
}
