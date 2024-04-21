package assu.study.kotlinme.chap05.inheritanceExtensions

// 기반 클래스
open class Heater {
    fun heat(temperature: Int) = "heat to $temperature"
}

// 기반 클래스 객체에 작용하는 함수
fun warm(heater: Heater) {
    heater.heat(70)
}
