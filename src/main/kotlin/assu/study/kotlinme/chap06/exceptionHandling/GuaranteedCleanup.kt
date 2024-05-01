package assu.study.kotlinme.chap06.exceptionHandling

data class Switch(var on: Boolean = false, var result: String = "ok")

// Switch 클래스를 리턴
fun testFinally(i: Int): Switch {
    val sw = Switch()
    try {
        sw.on = true
        when (i) {
            0 -> throw IllegalArgumentException()
            1 -> return sw
        }
    } catch (e: IllegalArgumentException) {
        sw.result = "exception~"
    } finally {
        sw.on = false
    }
    return sw
}

fun main() {
    println(testFinally(0)) // Switch(on=false, result=exception~)
    println(testFinally(1)) // Switch(on=false, result=ok)
    println(testFinally(2)) // Switch(on = false, result = ok)
}
