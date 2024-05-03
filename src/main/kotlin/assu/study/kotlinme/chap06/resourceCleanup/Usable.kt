package assu.study.kotlinme.chap06.resourceCleanup

class Usable : AutoCloseable {
    fun func() = println("func()~")

    override fun close() = println("close()~")
}

fun main() {
    // func()~
    // close()~
    Usable().use { it.func() }
}
