package assu.study.kotlin_me.chap02

fun main() {
    // map 생성
    val constantMap = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3
    )

    println(constantMap)    // {one=1, two=2, three=3}

    println(constantMap["two"]) // 2
    // Map 에서 key 는 유일하기 때문에 keys 를 호출하면 Set 이 생성됨
    println(constantMap.keys == setOf("one", "two", "three"))   // true
    println(constantMap.keys == setOf("one", "three", "two"))   // true
    println(constantMap.values) // [1,2,3]
    println(constantMap.values == listOf(1, 2, 3))  // false
    println(constantMap.values == arrayOf(1, 2, 3)) // false
    //println(constantMap.values == [1, 2, 3])  // 오류, Unsupported [Collection literals outside of annotations]

    // map iteration
    var string = ""
    for (entry in constantMap) {
        string += "${entry.key}:${entry.value}"
    }
    println(string) // one:1 two:2 three:3

    // map 을 iteration 하면서 키와 값을 분리
    var string2 = ""
    for ((key, value) in constantMap) {
        string2 += "${key}:${value} "
    }
    println(string2)    // one:1 two:2 three:3
}