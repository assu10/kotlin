package assu.study.kotlinme.chap04.lambda

fun main() {
    // 파라메터가 없는 람다의 경우 화살표만 넣은 경우
    run({ -> println("haha") })  // haha

    // 파라메터가 없는 람다의 경우 화살표를 생략한 경우
    run({ println("haha2") })    // () -> kotlin.String

    println({ "haha2" })   //() -> kotlin.String
    println({ "haha2" }.invoke())   // haha2
}