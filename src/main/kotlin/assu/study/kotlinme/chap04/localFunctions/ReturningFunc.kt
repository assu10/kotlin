package assu.study.kotlinme.chap04.localFunctions

// 익명 함수 반환
fun first(): (Int) -> Int {
    val func = fun(i: Int) = i + 1
    return func
}

// 람다 반환
fun second(): (String) -> String {
    val func2 = { s: String -> "$s!!" }
    return func2
}

// Local 함수에 대한 참조 반환
fun third(): () -> String {
    fun func3() = "Hi!"
    return ::func3
}

// third() 와 같은 효과를 내지만 식 본문을 써서 더 간결하게 표현
fun forth() = fun() = "Hi!"

// 람다를 식 본문 함수에 사용하여 같은 효과를 냄
fun fifth() = { "Hi!" }

fun main() {
    val funRef1: (Int) -> Int = first()
    val funRef2: (String) -> String = second()
    val funRef3: () -> String = third()
    val funRef4: () -> String = forth()
    val funRef5: () -> String = fifth()

    println(funRef1(11)) // 12
    println(funRef2("aaa")) // aaa!!
    println(funRef3()) // Hi!
    println(funRef4()) // Hi!
    println(funRef5()) // Hi!

    println(first()) // (kotlin.Int) -> kotlin.Int
    println(first()(22)) // 23
    println(second()) // (kotlin.String) -> kotlin.String
    println(second()("bbb")) // bbb!!
    // 컴파일 오류
    // Function 'func3' (JVM signature: third$func3()Ljava/lang/String;) not resolved in class kotlin.jvm.internal.Intrinsics$Kotlin: no members found
    // println(third())
    println(third()()) // Hi!
    println(forth()) // () -> kotlin.String
    println(forth()()) // Hi!
    println(fifth()) // () -> kotlin.String
    println(fifth()()) // Hi!
}
