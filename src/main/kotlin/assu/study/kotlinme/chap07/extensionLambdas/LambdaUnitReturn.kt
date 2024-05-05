package assu.study.kotlinme.chap07.extensionLambdas

class A1 {
    fun af() = 1
}

fun unitReturn(lambda1: A1.() -> Unit) = A1().lambda1()

fun nonUnitReturn(lambda1: A.() -> String) = A().lambda1()

fun main() {
    val result1 = unitReturn { "Unit 은 리턴값을 무시하기 때문에 이건 아무것도 할 수 없음" }
    val result2 = unitReturn { 1 } // 임의의 타입
    val result3 = unitReturn { } // 아무 값도 만들어내지 않는 경우
    val result4 = nonUnitReturn { "적절한 타입을 넣어주세요" }

    // 컴파일 오류
    // val result5 = nonUnitReturn { }

    println(result1) // kotlin.Unit
    println(result2) // kotlin.Unit
    println(result3) // kotlin.Unit
    println(result4) // 적절한 타입을 넣어주세요
}
