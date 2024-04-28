package assu.study.kotlinme.chap05.companionObjects

class CompanionInit {
    init {
        println("CompanionInit Constructor~")
    }

    companion object {
        init {
            println("Companion Constructor~")
        }
    }
}

fun main() {
    println("before")

    // Companion Constructor~
    // CompanionInit Constructor~

    CompanionInit()
    println("after 1")

    // CompanionInit Constructor~
    CompanionInit()
    println("after 2")

    // CompanionInit Constructor~
    CompanionInit()
    println("after 3")
}
