package assu.study.kotlinme.chap04.highOrderFunctions

// 여러 타입의 List 에 대해 호출할 수 있도록 제네릭 List<T> 타입의 확장 함수 정의
fun <T> List<T>.customAny(
    customPredicate: (T) -> Boolean, // customPredicate 함수를 리스트의 원소에 적용할 수 있어야 하므로 이 함수는 파라메터 타입 T 를 인자로 받는 함수이어야 함
): Boolean {
    for (ele in this) {
        if (customPredicate(ele)) { // customPredicate 함수를 적용하면 선택 기준을 ele 가 만족하는지 알 수 있음
            return true
        }
    }
    return false
}

fun main() {
    val ints = listOf(1, 2, 3)
    val result1 = ints.customAny { it > 0 }
    println(result1) // true

    val strings = listOf("abc", " ")

    // 함수 인자로 람다 전달
    val result2 = strings.customAny { it.isBlank() }

    // 함수 인자로 함수 참조 전달
    val result3 = strings.customAny(String::isNotBlank)
    println(result2) // true
    println(result3) // true
}
