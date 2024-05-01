package assu.study.kotlinme.chap06.exceptionHandling

class Exception1(val value: Int) : Exception("wrong value: $value")

open class Exception2(desc: String) : Exception(desc)

class Exception3(desc: String) : Exception2(desc)

fun main() {
    throw Exception1(11)
    throw Exception3("abc")
}
