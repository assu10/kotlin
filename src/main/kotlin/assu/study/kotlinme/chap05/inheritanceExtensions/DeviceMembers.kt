package assu.study.kotlinme.chap05.inheritanceExtensions

interface Device {
    val model: String
    val productionYear: Int

    // 멤버 함수로 정의
    fun overpriced() = model.startsWith("i")

    fun outdated() = productionYear < 2050
}

class MyDevice(override val model: String, override val productionYear: Int) : Device

fun main() {
    val aa: Device = MyDevice("car", 2000)

    println(aa.overpriced()) // false
    println(aa.outdated()) // true
}
