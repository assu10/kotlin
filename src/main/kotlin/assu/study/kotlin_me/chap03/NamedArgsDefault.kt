package assu.study.kotlin_me.chap03

fun color(red: Int, yellow: Int, blue: Int) = "$red, $yellow, $blue"

fun main() {
    // 가독성이 좋지 못하여 함수를 직접 살펴봐야 함
    val result1 = color(1, 2, 3)

    // 모든 인자의 의미가 명확함
    val result2 = color(
        red = 1,
        yellow = 2,
        blue = 3
    )

    // 모든 인자에 이름을 붙이지 않아도 됨
    val result3 = color(1, 2, blue = 3)

    // 인자에 이름을 붙이면 순서를 변경하여 함수 호출 가능
    val result4 = color(blue = 3, red = 1, yellow = 2)

    // 일부만 인자에 이름을 붙여서 호출 가능
    val result5 = color(red = 1, 2, 3)

    //val result6 = color(blue = 3, 1, 2) // 오류, 일부만 이름을 붙이려면 순서를 지켜야 함

    println(result1)    // 1, 2, 3
    println(result2)    // 1, 2, 3
    println(result3)    // 1, 2, 3
    println(result4)    // 1, 2, 3
    println(result5)    // 1, 2, 3
}