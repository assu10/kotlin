package assu.study.kotlinme.chap03

class Color(
    val red: Int = 0,
    val yellow: Int = 0,
    val blue: Int = 0,
) {
    override fun toString() = "$red, $yellow, $blue"
}

fun main() {
    // 생성자에 이름 붙은 인자와 디폴트 인자 사용
    val result = Color(red = 1).toString()

    println(result) // 1, 0, 0
}
