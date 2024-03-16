package assu.study.kotlin_me.chap02

fun main(args: Array<String>) {
    for (a in args) {
        println(a)  // 1 3
    }

    if (args.size < 3) return
    val first = args[0]
    val second = args[1].toInt()
    val third = args[2].toFloat()
    println("$first $second $third")    // dd 1 3.1
}