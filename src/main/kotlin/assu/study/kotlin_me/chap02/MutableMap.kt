package assu.study.kotlin_me.chap02

fun main() {
    val mutableMap = mutableMapOf(1 to "one", 2 to "two")

    println(mutableMap[2])  // two

    mutableMap[2] = "twotwo"
    println(mutableMap[2])  // twotwo

    mutableMap += 3 to "three"
    println(mutableMap) // {1=one, 2=twotwo, 3=three}

    val result = mutableMap == mapOf(1 to "one", 2 to "twotwo", 3 to "three")
    val result2 = mutableMap == mapOf(1 to "one", 3 to "three", 2 to "twotwo")
    println(result) // true
    println(result2)    // true
}