package assu.study.kotlinme.chap06.nothingType

// 항상 예외를 던지므로 반환 타입이 Nothing
fun fail(i: Int): Nothing {
    throw Exception("fail $i")
}

fun main() {
    // Exception in thread "main" java.lang.Exception: fail 1
    fail(1)
}
