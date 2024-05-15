package assu.study.kotlinme.chap07.propertyDelegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class ReadWritable2(var i: Int) {
    var msg = ""

    // value 프로퍼티는 BasicReadWrite2 객체에 의해 위임됨
    var value: String by BasicReadWrite2()
}

// 위임 클래스
class BasicReadWrite2 : ReadWriteProperty<ReadWritable2, String> {
    override fun getValue(
        rw: ReadWritable2,
        property: KProperty<*>,
    ) = "getValue: ${rw.i}~"

    override fun setValue(
        rw: ReadWritable2,
        property: KProperty<*>,
        s: String,
    ) {
        rw.i = s.toIntOrNull() ?: 0
        rw.msg = "setValue to ${rw.i}~"
    }
}

fun main() {
    val x = ReadWritable2(1)
    println("1: " + x.value) // 1: getValue: 1~
    println("2: " + x.msg) // 2:
    println("3: " + x.i) // 3: 1

    x.value = "99"
    println("4: " + x.value) // 4: getValue: 99~
    println("5: " + x.msg) // 5: setValue to 99~
    println("6: " + x.i) // 6: 99
}
