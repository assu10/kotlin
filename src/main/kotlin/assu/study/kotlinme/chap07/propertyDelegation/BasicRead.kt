package assu.study.kotlinme.chap07.propertyDelegation

import kotlin.reflect.KProperty

// 위임 클래스
class BasicRead {
    // Readable 에 대한 접근을 가능하게 하는 Readable 파라메터를 얻음
    operator fun getValue(
        r: Readable,
        property: KProperty<*>,
    ) = "getValue: ${r.i}~"
}

class Readable(val i: Int) {
    // value 프로퍼티는 BasicRead() 객체에 의해 위임됨
    // 프로퍼티 뒤에 by 라고 지정하여 BasicRead 객체를 by 앞의 프로퍼티인 value 와 연결
    // 이 때 BasicRead 의 getValue() 는 Readable 의 i 에 접근 가능
    // getValue() 가 String 을 반환하므로 value 프로퍼티의 타입도 String 이어야 함
    val value: String by BasicRead()

    // val value by BasicRead() // 이렇게 써도 됨
}

fun main() {
    val x = Readable(1)
    val y = Readable(2)

    println(x.value) // getValue: 1~
    println(y.value) // getValue: 2~
}
