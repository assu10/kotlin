package assu.study.kotlinme.helloWorld

fun multiple(x: Int): Int {
    println("multiple~")
    return x * 2
}

fun meaningless() {
    println("meaningless~")
}

fun multiple2(x: Int): Int = x * 2

fun main() {
    val result = multiple(5)
    println("result: $result")

    meaningless()

    val result2 = multiple2(5)
    println("result2: $result2")
}
