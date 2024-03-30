package assu.study.kotlinme.chap03.destructuring

data class Computation(
    val data: Int,
    val info: String,
)

fun eval(input: Int) =
    if (input > 5) {
        Computation(input * 2, "High")
    } else {
        Computation(input * 2, "Low")
    }

fun main() {
    val (value, desc) = eval(7)
    println(value) // 14
    println(desc) // High
}
