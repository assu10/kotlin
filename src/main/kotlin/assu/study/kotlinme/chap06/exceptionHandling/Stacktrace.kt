package assu.study.kotlinme.chap06.exceptionHandling

class Exception11(val value: Int) : Exception("wrong value: $value")

fun func1(): Int = throw Exception11(-11)

fun func2() = func1()

fun func3() = func2()

fun main() {
    func3()
}
