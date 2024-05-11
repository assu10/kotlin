package assu.study.kotlinme.chap07.creatingGenerics

import kotlin.random.Random

private val rand = Random(47)

// 타입 파라메터 제약을 사용하지 않은 확장 함수
// action() 에 접근할 수는 있지만 정확한 타입 반환 불가 (result4 참고)
fun List<Disposable>.nonGenericConstrainedRandom2(): Disposable {
    val d: Disposable = this[rand.nextInt(this.size)]
    d.action()
    return d
}

// 제네릭 확장 함수
// 타입 파라메터 제약이 없어서 action() 에 접근 불가
fun <T> List<T>.genericRandom2(): T {
    val d: T = this[rand.nextInt(this.size)]
    // action() 에 접근 불가
    // d.action()
    return d
}

// 타입 파라메터 제약을 사용한 확장 함수
// action() 에 접근하고, 정확한 타입 반환 가능
fun <T : Disposable> List<T>.genericConstrainedRandom2(): T {
    val d: T = this[rand.nextInt(this.size)]
    d.action()
    return d
}

fun main() {
    val result1: Disposable = recyclables.nonGenericConstrainedRandom2()
    val result2: Disposable = recyclables.genericRandom2()
    val result3: Disposable = recyclables.genericConstrainedRandom2()

    // 컴파일 오류
    // 기반 클래스인 Disposable 타입만 가능
    // 다형성인 경우 반환 타입을 기반 타입으로 업캐스트해야함
    // val result4: Recyclable = recyclables.nonGenericConstrainedRandom2()
    val result5: Recyclable = recyclables.genericRandom2()
    val result6: Recyclable = recyclables.genericConstrainedRandom2()

    println(result1.action()) // add to recyclable~
    println(result2.action()) // add to recyclable~
    println(result3.action()) // add to recyclable~
    println(result5.action()) // add to recyclable~
    println(result6.action()) // add to recyclable~
}
