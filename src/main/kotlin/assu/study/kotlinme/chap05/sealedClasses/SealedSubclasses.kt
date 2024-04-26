package assu.study.kotlinme.chap05.sealedClasses

sealed class Top

class Middle1 : Top()

class Middle2 : Top()

open class Middle3 : Top()

class Bottom2 : Middle3()

fun main() {
    val result =
        Top::class.sealedSubclasses
            .map { it.simpleName }

    // Bottom2 은 나오지 않음
    println(result) // [Middle1, Middle2, Middle3]
}
