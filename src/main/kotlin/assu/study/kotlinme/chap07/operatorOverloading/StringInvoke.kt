package assu.study.kotlinme.chap07.operatorOverloading

// 함수를 파라메터로 받아서 그 함수에 현재의 String 을 넘기는 확장 함수
operator fun String.invoke(f: (s: String) -> String) = f(this)

fun main() {
    // 이 람다는 invoke() 의 마지막 인자이기 때문에 괄호를 사용하지 않고 호출 가능
    val result = "aaa" { it.uppercase() }

    println(result) // AAA
}
