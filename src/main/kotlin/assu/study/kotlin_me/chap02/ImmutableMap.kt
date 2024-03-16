package assu.study.kotlin_me.chap02

fun main() {
    val immutableMap = mapOf(1 to "one", 2 to "two")

    // immutableMap[1] = "oneone"   // 오류

    // immutableMap += (3 to "three)"    // 오류

    // immutableMap 을 바꾸지 않음
    immutableMap + (3 to "three")
    println(immutableMap)   // {1=one, 2=two}

    val immutableMap2 = immutableMap + (3 to "three")
    // immutableMap2[3] = "dd" 오류
    println(immutableMap2)  // {1=one, 2=two, 3=three}

}