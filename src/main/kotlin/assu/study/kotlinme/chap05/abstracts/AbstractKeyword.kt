package assu.study.kotlinme.chap05.abstracts

abstract class WithProperty {
    // 아무 초기값도 없는 변수 선언
    abstract val x: Int
}

abstract class WithFunctions {
    abstract fun f(): Int

    // abstract 함수의 반환 타입을 지정하지 않으면 코틀린은 반환 타입을 Unit 이라고 간주함
    abstract fun g(n: Double)
}
