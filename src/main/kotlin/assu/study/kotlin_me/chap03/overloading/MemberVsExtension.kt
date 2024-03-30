package assu.study.kotlin_me.chap03.overloading

class Dog {
    fun foo() = 0
}

// 멤버 함수와 시그니처가 중복되는 확장 함수는 의미없음
fun Dog.foo() = 1

// 다른 파라메터 목록을 제공함으로써 멤버 함수를 확장 함수로 오버로딩함
fun Dog.foo(i: Int) = i + 2

fun main() {
    val result1 = Dog().foo()
    val result2 = Dog().foo(1)

    println(result1)    // 0
    println(result2)    // 3
}