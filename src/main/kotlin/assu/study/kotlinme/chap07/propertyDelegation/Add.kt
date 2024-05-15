package assu.study.kotlinme.chap07.propertyDelegation

import kotlin.reflect.KProperty

// 위임자 클래스
class Add(val a: Int, val b: Int) {
    // sum 프로퍼티는 Sum() 객체에 의해 위임됨
    val sum by Sum()
}

// 위임받는 클래스
class Sum

// getValue() 를 확장 함수로 만듬
operator fun Sum.getValue(
    thisRef: Add,
    property: KProperty<*>,
): Int = thisRef.a + thisRef.b

fun main() {
    val add = Add(1, 2)

    println(add.sum) // 3
}
