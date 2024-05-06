package assu.study.kotlinme.chap07.extensionLambdas

fun exec(
    arg1: Int,
    arg2: Int,
    f: Int.(Int) -> Boolean,
) = arg1.f(arg2)

fun main() {
    val result =
        exec(
            10,
            2,
            fun Int.(d: Int): Boolean { // 익명 람다 위치에 익명 확장 함수를 사용
                println("---$this") // 10
                return this % d == 0
            },
        )

    println(result) // true
}
