package assu.study.kotlinme.chap03.overloading

fun foo(n: Int = 1) = println("foo-1-$n")

fun foo() {
    println("foo-2")
    foo(12)
}

fun main() {
    // 디폴트 인자가 있는 foo(n: Int = 1) 을 호출하지 않고, 파라메터가 없는 foo() 함수만 호출하
    foo()
    // foo-2
    // foo-1-12
}
