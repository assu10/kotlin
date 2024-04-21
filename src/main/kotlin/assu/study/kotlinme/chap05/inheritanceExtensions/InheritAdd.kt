package assu.study.kotlinme.chap05.inheritanceExtensions

open class Heater1 {
    fun heat(temperature: Int) = println("heat to $temperature")
}

// 기반 클래스 객체에 작용하는 함수
fun warm(heater: Heater1) {
    heater.heat(70)
}

// Heater1 이 원하는 기능을 전부 제공하지 못하기 때문에 Heater 를 상속하여 HVAC1 을 만든 후 다른 함수 추가
class HVAC1 : Heater1() {
    fun cool(temperature: Int) = println("cool to $temperature")
}

fun warmAndCool(hvac: HVAC1) {
    hvac.heat(80)
    hvac.cool(10)
}

fun main() {
    val heater1 = Heater1()
    val hvac1 = HVAC1()

    warm(heater1) // heat to 70
    warm(hvac1) // heat to 70

    // heat to 80
    // cool to 10
    warmAndCool(hvac1)
}
