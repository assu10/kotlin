package assu.study.kotlin_me.chap02

class Data(var i: Int)

fun main() {
    val data = Data(1)
    println(data.i) // 1
    data.i = 2
    println(data.i) // 2
}
