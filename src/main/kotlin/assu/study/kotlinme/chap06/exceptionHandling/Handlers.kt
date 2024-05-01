package assu.study.kotlinme.chap06.exceptionHandling

class Exception111(val value: Int) : Exception("wrong value: $value")

open class Exception222(desc: String) : Exception(desc)

class Exception333(desc: String) : Exception222(desc)

fun toss(which: Int) =
    when (which) {
        1 -> throw Exception111(111)
        2 -> throw Exception222("222")
        3 -> throw Exception333("333")
        else -> "ok"
    }

fun test(which: Int): Any? =
    try {
        toss(which)
    } catch (e: Exception111) {
        println("1 e: $e")
        println("1 e.message: ${e.message}")
        println("1 e.value: ${e.value}")
        e.message
    } catch (e: Exception333) {
        println("3 e: $e")
        println("3 e.message: ${e.message}")
        // println("1 e.value: ${e.value}")
        e.message
    } catch (e: Exception222) {
        println("2 e: $e")
        println("2 e.message: ${e.message}")
        // println("3 e.value: ${e.value}")
        e.message
    }

fun main() {
    println(test(0)) // ok
    println(test(1)) // 111
    println(test(2)) // 222
    println(test(3)) // 333
}
