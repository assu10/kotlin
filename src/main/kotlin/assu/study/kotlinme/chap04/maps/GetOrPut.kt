package assu.study.kotlinme.chap04.maps

fun main() {
    val map = mapOf(1 to "one", 2 to "two")

    val result1 = map.getOrElse(0) { "zero" }
    val result2 = map.getOrElse(1) { "zero" }

    println(result1) // zero
    println(result2) // one

    // immutableMap 을 mutableMap 으로 변환
    val mutableMap = map.toMutableMap()

    // 0 이라는 key 가 없으므로 Map 에 {0=zero} 추가 후 zero 라는 value 반환
    var result3 = mutableMap.getOrPut(0) { "zero" }

    // 1 이라는 key 가 있으므로 1에 해당하는 value 인 one 반환
    var result4 = mutableMap.getOrPut(1) { "zero" }

    println(result3) // zero
    println(result4) // one

    println(mutableMap) // {1=one, 2=two, 0=zero}
}
