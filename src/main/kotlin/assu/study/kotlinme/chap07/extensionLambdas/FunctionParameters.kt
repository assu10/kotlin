package assu.study.kotlinme.chap07.extensionLambdas

class A {
    fun af() = 1
}

class B {
    fun bf() = 2
}

fun f1(lambda1: (A, B) -> Int) = lambda1(A(), B())

// 함수의 파라메터로 확장 람다 사용
fun f2(lambda2: A.(B) -> Int) = A().lambda2(B())

fun main() {
    val result1 = f1 { aa, bb -> aa.af() + bb.bf() }
    val result2 = f2 { af() + it.bf() }

    println(result1) // 3
    println(result2) // 3
}
