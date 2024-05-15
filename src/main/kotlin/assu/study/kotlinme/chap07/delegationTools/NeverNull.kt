package assu.study.kotlinme.chap07.delegationTools

import kotlin.properties.Delegates

class NeverNull {
    var nn: Int by Delegates.notNull()
}

fun main() {
    val non = NeverNull()

    // java.lang.IllegalStateException: Property nn should be initialized before get.
    // println(non.nn)

    non.nn = 1
    println(non.nn) // 1
}
