package assu.study.kotlinme.chap06.exceptionHandling

class IncorrectInputException1(
    message: String,
) : Exception(message)

fun checkCode(code: Int) {
    if (code <= 1000) {
        throw IncorrectInputException1("code must be > 1000: $code")
    }
}

fun main() {
    try {
        // A1 은 16진수로 161
        checkCode("A1".toInt(16))
    } catch (e: IncorrectInputException1) {
        println(e.message) // code must be > 1000: 161
    } catch (e: IllegalArgumentException) {
        println("produces error ${e.message}")
    }

    try {
        checkCode("1".toInt(1))
    } catch (e: IncorrectInputException1) {
        println(e.message)
    } catch (e: IllegalArgumentException) {
        println("produces error ${e.message}") // produces error radix 1 was not in valid range 2..36
    }
}
