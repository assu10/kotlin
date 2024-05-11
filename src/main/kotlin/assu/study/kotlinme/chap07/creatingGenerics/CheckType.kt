package assu.study.kotlinme.chap07.creatingGenerics

// 타입 정보를 유지하여 어떤 객체가 특정 타입인지 검사 가능
inline fun <reified T> check(t: Any) = t is T

// 컴파일 오류
// reified 가 없으면 타입 정보가 소거되기 때문에 실행 시점에 어떤 객체가 T 의 인스턴스인지 검사 불가
// Cannot check for instance of erased type: T
// fun <T> check2(t: Any) = t is T

fun main() {
    val result1 = check<String>("1")
    val result2 = check<String>(1)

    println(result1) // true
    println(result2) // false
}
