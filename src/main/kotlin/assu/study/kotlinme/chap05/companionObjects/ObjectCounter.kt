package assu.study.kotlinme.chap05.companionObjects

class Counted {
    companion object {
        private var n = 0
    }

    private val id = n++

    override fun toString() = "$id"
}

fun main() {
    val result = List(4) { Counted() }

    println(result) // [0, 1, 2, 3]
}
