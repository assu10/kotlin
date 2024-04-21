package assu.study.kotlinme.chap05.inheritanceExtensions

// 기반 클래스
open class Heater2 {
    fun heat(temperature: Int) = println("heat to $temperature")
}

// 기반 클래스 객체에 작용하는 함수
fun warm2(heater: Heater2) {
    heater.heat(70)
}

// 기반 클래스 객체에 작용하는 확장 함수
fun Heater2.cool(temperature: Int) = println("cool to $temperature")

fun warnAndCool2(heater: Heater2) {
    heater.heat(80)
    heater.cool(10)
}

fun main() {
    val heater = Heater2()
    warm2(heater) // heat to 70

    // heat to 80
    // cool to 10
    warnAndCool2(heater)
}
