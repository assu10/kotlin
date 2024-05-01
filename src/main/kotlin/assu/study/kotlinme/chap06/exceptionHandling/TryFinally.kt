package assu.study.kotlinme.chap06.exceptionHandling

fun checkValue(value: Int) {
    try {
        println(value)
        if (value <= 0) {
            throw IllegalArgumentException("value must be positive: $value")
        }
    } finally {
        println("finally for $value")
    }
}

fun main() {
    val result = listOf(10, -10)

    result.forEach {
        try {
            checkValue(it)
        } catch (e: IllegalArgumentException) {
            println("catch for main: ${e.cause}, ${e.message}")
        }
    }
}
