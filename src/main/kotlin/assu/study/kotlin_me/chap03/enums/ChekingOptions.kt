package assu.study.kotlin_me.chap03.enums

// Level 의 이름 임포트
// Level 의 원소들 임포트
import assu.study.kotlin_me.chap03.enums.Level.EMPTY
import assu.study.kotlin_me.chap03.enums.Level.HIGH

fun checkLevel(level: Level) {
    when (level) {
        HIGH -> println("high")
        EMPTY -> println("empty")
        else -> println("Level $level")
    }
}

fun main() {
    // empty
    //kotlin.Unit
    println(checkLevel(EMPTY))

    // Level LOW
    //kotlin.Unit
    println(checkLevel(Level.LOW))
}