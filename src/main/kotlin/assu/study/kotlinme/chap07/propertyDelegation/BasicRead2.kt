package assu.study.kotlinme.chap07.propertyDelegation

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class Readable2(val i: Int) {
    val value: String by BasicRead2()

    // SAM 변환
    val value2: String by ReadOnlyProperty { _, _ -> "getValue: $i~~" }
}

// 위임 클래스
class BasicRead2 : ReadOnlyProperty<Readable2, String> {
    override operator fun getValue(
        thisRef: Readable2,
        property: KProperty<*>,
    ) = "getValue: ${thisRef.i}~"
}

fun main() {
    val x = Readable2(1)
    val y = Readable2(2)

    println(x.value) // getValue: 1~
    println(x.value2) // getValue: 1~~
    println(y.value) // getValue: 2~
    println(y.value2) // getValue: 2~~
}
