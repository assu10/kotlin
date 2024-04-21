package assu.study.kotlinme.chap05.inheritanceExtensions

interface Device1 {
    val model: String
    val productionYear: Int
}

// 확장 함수로 정의
fun Device1.overpriced() = model.startsWith("i")

fun Device1.outdated() = productionYear < 2050

class MyDevice1(override val model: String, override val productionYear: Int) : Device1

fun main() {
    val aa: Device1 = MyDevice1("car", 2000)

    println(aa.overpriced()) // false
    println(aa.outdated()) // true
}
