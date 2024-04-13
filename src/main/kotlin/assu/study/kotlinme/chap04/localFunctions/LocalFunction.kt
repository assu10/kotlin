package assu.study.kotlinme.chap04.localFunctions

fun main() {
    val logMsg = StringBuilder()

    // main() 안에 내포되어 있는 log()
    fun log(message: String) = logMsg.appendLine(message)

    log("Starting~")

    val x = 11
    log("Compute result: $x")

    // Starting~
    // Compute result: 11
    println(logMsg.toString())
}
