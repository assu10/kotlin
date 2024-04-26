package assu.study.kotlinme.chap05.sealedClasses

open class Transport

data class Train(val line: String) : Transport()

data class Bus(val number: String, val capacity: Int) : Transport()

fun travel(transport: Transport) =
    when (transport) {
        is Train -> "Train ${transport.line}"
        is Bus -> "Bus ${transport.number}: size ${transport.capacity}"
        else -> "$transport is in limbo~" // else 구문이 없으면 컴파일 오류
        // 'when' expression must be exhaustive, add necessary 'else' branch
    }

fun main() {
    val result =
        listOf(Train("AA"), Bus("BB", 5))
            .map(::travel)

    println(result) // [Train AA, Bus BB: size 5]
}
