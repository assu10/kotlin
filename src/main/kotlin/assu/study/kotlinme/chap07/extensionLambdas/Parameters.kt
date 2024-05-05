package assu.study.kotlinme.chap07.extensionLambdas

// Int 의 확장 람다
// 파라메터는 아무것도 받지 않고 Boolean 리턴 () -> Boolean
val zero: Int.() -> Boolean = {
    this == 0
}

// 파라메터에 이름을 붙이는 대신 `it` 사용
val one: Int.(Int) -> Boolean = {
    this % it == 0
}

val two: Int.(Int, Int) -> Boolean = { arg1, arg2 ->
    this % (arg1 + arg2) == 0
}

val three: Int.(Int, Int, Int) -> Boolean = { arg1, arg2, arg3 ->
    this % (arg1 + arg2 + arg3) == 0
}

fun main() {
    val result1 = 0.zero()
    val result2 = 10.one(10)
    val result3 = 20.two(10, 10)
    val result4 = 30.three(10, 10, 10)

    println(result1) // true
    println(result2) // true
    println(result3) // true
    println(result4) // true
}
