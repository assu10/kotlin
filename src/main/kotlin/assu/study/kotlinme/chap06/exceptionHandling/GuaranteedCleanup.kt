package assu.study.kotlinme.chap06.exceptionHandling

import org.apache.coyote.BadRequestException

data class Switch(var on: Boolean = false, var result: String = "ok")

// Switch 클래스를 리턴
fun testFinally(i: Int): Switch {
    val sw = Switch()
    try {
        sw.on = true
        when (i) {
            0 -> throw IllegalArgumentException()
            2 -> throw BadRequestException()
            1 -> return sw
        }
    } catch (e: IllegalArgumentException) {
        sw.result = "exception~"
        println("catch~")
    } finally {
        sw.on = false
        println("finally~")
    }
    return sw
}

fun main() {
    // catch~
    // finally~
    // Switch(on=false, result=exception~)
    println(testFinally(0))

    // finally~
    // Switch(on=false, result=ok)
    println(testFinally(1))

    // finally~
    // Exception in thread "main" org.apache.coyote.BadRequestException
    println(testFinally(2)) // Switch(on=false, result=ok)
}
