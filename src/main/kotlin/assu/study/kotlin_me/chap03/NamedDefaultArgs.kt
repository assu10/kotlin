package assu.study.kotlin_me.chap03

// blue 뒤에 덧붙은 콤마(trailing comma) 사용
fun color2(
    red: Int = 0,
    yellow: Int = 0,
    blue: Int = 0,
) = "$red, $yellow, $blue"

fun main() {
    val result1 = color2(1)
    val result2 = color2(blue = 2)
    var result3 = color2(1, 2)
    var result4 = color2(red = 1, blue = 2)

    println(result1)    // 1, 0, 0
    println(result2)    // 0, 0, 2
    println(result3)    // 1, 2, 0
    println(result4)    // 1, 0, 2
}