package assu.study.kotlinme.chap07.creatingGenerics

import kotlin.random.Random

private val rand = Random(47)

// 타입 파라메터 제약을 사용하지 않은 확장 함수
fun List<Disposable>.nonGenericConstrainedRandom(): Disposable = this[rand.nextInt(size)]

// 타입 파라메터 제약을 사용한 확장 함수
fun <T : Disposable> List<T>.genericConstrainedRandom(): T = this[rand.nextInt(size)]

// 제네릭 확장 함수
fun <T> List<T>.genericRandom(): T = this[rand.nextInt(size)]

fun main() {
    val result1: Disposable = recyclables.nonGenericConstrainedRandom()
    val result2: Disposable = recyclables.genericConstrainedRandom()
    val result3: Disposable = recyclables.genericRandom()

    // 컴파일 오류
    // 기반 클래스인 Disposable 타입만 가능
    // 다형성인 경우 반환 타입을 기반 타입으로 업캐스트해야함
    // val result4: Recyclable = recyclables.nonGenericConstrainedRandom()
    val result5: Recyclable = recyclables.genericConstrainedRandom()
    val result6: Recyclable = recyclables.genericRandom()

    println(result1) // assu.study.kotlinme.chap07.creatingGenerics.Recyclable@31221be2
    println(result2) // assu.study.kotlinme.chap07.creatingGenerics.Recyclable@377dca04
    println(result3) // assu.study.kotlinme.chap07.creatingGenerics.Recyclable@377dca04

    println(result5) // assu.study.kotlinme.chap07.creatingGenerics.Recyclable@31221be2
    println(result6) // assu.study.kotlinme.chap07.creatingGenerics.Recyclable@31221be2
}
