package assu.study.kotlinme.chap07.creatingGenerics

// 타입 파라메터 제약 사용
// 타입 파라메터 제약을 사용하지 않으면 name 에 접근 불가
fun <T : Disposable> nameOf(disposable: T) = disposable.name

// 타입 파라메터 제약을 사용한 확장 함수
// 타입 파라메터 제약을 사용하지 않으면 name 에 접근 불가
fun <T : Disposable> T.customName() = name

fun main() {
    val result1 = recyclables.map { nameOf(it) }
    val result2 = recyclables.map { it.customName() }

    println(result1) // [EEE, FFF]
    println(result2) // [EEE, FFF]
}
