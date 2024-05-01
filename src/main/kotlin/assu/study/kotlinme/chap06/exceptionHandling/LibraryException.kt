package assu.study.kotlinme.chap06.exceptionHandling

fun testCode(code: Int) {
    if (code <= 1000) {
        throw IllegalArgumentException("code must be > 1000: $code")
    }
}

fun main() {
    try {
        // A1 은 16진수로 161
        testCode("A1".toInt(16))
    } catch (e: IllegalArgumentException) {
        println(e.message) // code must be > 1000: 161
    }

    try {
        testCode("0".toInt(1))
    } catch (e: IllegalArgumentException) {
        println(e.message) // radix 1 was not in valid range 2..36
    }
}
