package assu.study.kotlinme.chap05.inheritanceExtensions

class TemperatureDelta(
    val current: Double,
    val target: Double,
)

// 확장 함수
fun TemperatureDelta.heat() {
    if (current < target) {
        println("heating to $target")
    }
}

// 확장 함수
fun TemperatureDelta.cool() {
    if (current > target) {
        println("cooling to $target")
    }
}

fun adjust(delta: TemperatureDelta) {
    delta.heat()
    delta.cool()
}

fun main() {
    adjust(TemperatureDelta(50.0, 60.0)) // heating to 60.0
    adjust(TemperatureDelta(90.0, 70.0)) // cooling to 70.0
}
