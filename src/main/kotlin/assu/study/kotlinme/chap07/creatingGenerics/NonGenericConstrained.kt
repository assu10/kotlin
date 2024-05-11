package assu.study.kotlinme.chap07.creatingGenerics

// 타입 파라메터 제약을 사용하지 않음
fun nameOf2(disposable: Disposable) = disposable.name

// 티입 파라메터 제약을 사용하지 않은 확장 함수
fun Disposable.customName2() = name

fun main() {
    val result1 = recyclables.map { nameOf2(it) }
    val result2 = recyclables.map { it.customName2() }

    println(result1) // [EEE, FFF]
    println(result2) // [EEE, FFF]
}
