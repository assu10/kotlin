package assu.study.kotlinme.chap03.enums

enum class Level {
    OVER,
    HIGH,
    MEDIUM,
    LOW,
    EMPTY,
}

fun main() {
    println(Level.MEDIUM) // MEDIUM
}
