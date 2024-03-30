package assu.study.kotlinme.chap03.destructuring

data class Tuple(
    val i: Int,
    val d: Double,
    val s: String,
    val b: Boolean,
    val l: List<Int>,
)

fun main() {
    val tuple = Tuple(1, 1.1, "aa", true, listOf())
    val (i, d, s, b, l) = tuple

    println(i) // 1
    println(d) // 1.1
    println(s) // aa
    println(b) // true
    println(l) // []

    // 구조 분해 선언 시 선언할 식별자 중 일부가 필요하지 않으면 밑줄 _ 을 사용할 수 있고, 맨 뒤쪽의 이름들은 아예 생략 가능
    val (_, _, animal) = tuple
    println(animal) // aa
}
