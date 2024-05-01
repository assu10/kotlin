package assu.study.kotlinme.chap06.exceptionHandling

class Exception1111(val value: Int) : Exception("wrong value: $value")

open class Exception2222(desc: String) : Exception(desc)

class Exception3333(desc: String) : Exception2222(desc)

fun toss1(which: Int) =
    when (which) {
        1 -> throw Exception1111(111)
        2 -> throw Exception2222("222")
        3 -> throw Exception3333("333")
        else -> "ok"
    }

fun catchOrder(which: Int) =
    try {
        toss1(which)
    } catch (e: Exception1111) {
        "handler for Exception1111 got ${e.message}"
    } catch (e: Exception2222) {
        "handler for Exception2222 got ${e.message}"
    } catch (e: Exception3333) {
        "handler for Exception3333 got ${e.message}"
    }

fun main() {
    println(catchOrder(1)) // handler for Exception1111 got wrong value: 111
    println(catchOrder(2)) // handler for Exception2222 got 222
    println(catchOrder(3)) // handler for Exception2222 got 333
}
