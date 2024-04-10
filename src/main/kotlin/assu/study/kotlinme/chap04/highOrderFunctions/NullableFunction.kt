package assu.study.kotlinme.chap04.highOrderFunctions

fun main() {
    // 반환 타입을 nullable 타입으로 만듦
    val returnTypeNullable: (String) -> Int? = { null }

    // 함수 전체의 타입을 nullable 타입으로 만듦
    val mightBeNull: ((String) -> Int)? = null

    val result1 = returnTypeNullable("abc")

    // 컴파일 오류, Reference has a nullable type '((String) -> Int)?', use explicit '?.invoke()' to make a function-like call instead
    // val result2 = mightBeNull("abc")

    // if 문을 통해 명시적으로 null 검사를 한 것과 같음
    // mightBeNull 에 저장된 함수를 호출하기 전에 함수 참조 자체가 null 이 아닌지 반드시 검사해야 함
    val result2 = mightBeNull?.let { it("abc") }

    println(result1) // null
    println(result2) // null
}
