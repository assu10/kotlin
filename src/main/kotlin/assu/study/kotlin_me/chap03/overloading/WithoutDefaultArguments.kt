package assu.study.kotlin_me.chap03.overloading

// 추천하지 않는 코드임
// 결국 파라메터가 없는 함수만 호출할 뿐임

fun f(n: Int) = n + 1
fun f() = f(2)

fun main() {
    val result = f()

    println(result) // 3
}