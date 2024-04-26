package assu.study.kotlinme.chap05.sealedClasses

sealed class Transport1

data class Train1(val line: String) : Transport1()

data class Bus1(val number: String, val capacity: Int) : Transport1()

// 아래와 같은 오류가 나면서 컴파일 되지 않음
// 'when' expression must be exhaustive, add necessary 'is Bus2' branch or 'else' branch instead
// data class Bus2(val number: String, val capacity: Int) : Transport1()

fun travel1(transport: Transport1) =
    when (transport) {
        is Train1 -> "Train ${transport.line}"
        is Bus1 -> "Bus ${transport.number}: size ${transport.capacity}"
        // else 구문이 없어도 됨
    }

fun main() {
    val result =
        listOf(Train1("AA"), Bus1("BB", 5))
            .map(::travel1)

    println(result) // [Train AA, Bus BB: size 5]
}
