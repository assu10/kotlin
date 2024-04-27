package assu.study.kotlinme.chap05.objects

fun g() {
    Shared.i += 3
}

fun main() {
    f()
    g()
    println(Shared.i) // 5
}
