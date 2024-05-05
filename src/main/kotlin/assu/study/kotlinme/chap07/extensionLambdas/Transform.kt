package assu.study.kotlinme.chap07.extensionLambdas

// 일반 람다를 파라메터로 받는 String 의 확장 함수
fun String.transform1(
    n: Int,
    lambda: (String, Int) -> String,
) = lambda(this, n)

// 확장 람다를 파라메터로 받는 String 의 확장 함수
fun String.transform2(
    n: Int,
    lambda: String.(Int) -> String,
) = lambda(this, n)

// val 를 선언하여 String 의 확장 람다 이용
val duplicate: String.(Int) -> String = { repeat(it) }

// val 를 선언하여 String 의 확장 람다 이용
val alternate: String.(Int) -> String = {
    toCharArray()
        .filterIndexed { i, _ -> i % it == 0 }
        .joinToString(separator = "")
}

fun main() {
    val result1 = "hello".transform1(5, duplicate).transform2(3, alternate)
    val result2 = "hello".transform2(5, duplicate).transform1(3, alternate)

    println(result1) // hleolhleo
    println(result2) // hleolhleo
}
