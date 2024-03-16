package assu.study.kotlin_me.chap02

class LogChanges {
    var n: Int = 0
        set(value) {
            println("$field becomes $value")    // 0 becomes 2
            field = value
        }
}

fun main() {
    val lc = LogChanges()
    println(lc.n)   // 0

    lc.n = 2
    println(lc.n)   // 2
}