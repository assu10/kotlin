package assu.study.kotlinme.chap07.propertyDelegation

import kotlin.reflect.KProperty

// 위임자 클래스
class ReadWriteable(
    var i: Int,
) {
    var msg = ""

    // value 프로퍼티는 BasicReadWrite 객체에 의해 위임됨
    var value: String by BasicReadWrite()
}

// 위임받는 클래스
class BasicReadWrite {
    operator fun getValue(
        rw: ReadWriteable,
        property: KProperty<*>,
    ) = "getValue: ${rw.i}~"
    // ) = "getValue: ${rw.value}, ${rw.i}~" // 여기서 rw.value 에 접근하면 stackoverflow 발생

    operator fun setValue(
        rw: ReadWriteable,
        property: KProperty<*>,
        s: String,
    ) {
        rw.i = s.toIntOrNull() ?: 0
        rw.msg = "setValue to ${rw.i}~"
        // rw.value = "test~ ${rw.value}"   // 런타임 에러
        // rw.msg = "setValue to $rw.i~"   // 이렇게 하면 ReadWritable 에 메모리 주소가 출력됨
    }
}

fun main() {
    val x = ReadWriteable(1)
    println("1: " + x.value) // 1: getValue: 1~
    println("2: " + x.msg) // 2:
    println("3: " + x.i) // 3: 1

    x.value = "99"
    println("4: " + x.value) // 4: getValue: 99~
    println("5: " + x.msg) // 5: setValue to 99~
    println("6: " + x.i) // 6: 99
}
