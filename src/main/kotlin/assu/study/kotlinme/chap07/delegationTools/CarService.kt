package assu.study.kotlinme.chap07.delegationTools

// 위임자 클래스
// MutableMap 이 위임받는 객체
class Driver(
    iMap: MutableMap<String, Any?>,
) {
    // name 프로퍼티는 iMap 객체에 의해 위임됨
    var name: String by iMap
    var age: Int by iMap
    var coord: Pair<Double, Double> by iMap
}

fun main() {
    val info =
        mutableMapOf<String, Any?>(
            "name" to "assu",
            "age" to 20,
            "coord" to Pair(1.1, 2.2),
            "ddd" to "aa",
        )

    val driver = Driver(info)

    // {name=assu, age=20, coord=(1.1, 2.2)}
    println(info)

    // assu
    println(driver.name)
    driver.name = "silby" // 원본인 info Map 이 변경됨

    // {name=silby, age=20, coord=(1.1, 2.2)}
    println(info)
}
