package assu.study.kotlinme.chap03.`when`

// if 문 사용
fun ff(
    kg: Double,
    height: Double,
): String {
    val bmi = kg / (height * height)
    return if (bmi < 18.5) {
        "under weight"
    } else if (bmi < 25) {
        "normal weight"
    } else {
        "over weight"
    }
}

// 인자가 없는 when 사용
fun ffWithWhen(
    kg: Double,
    height: Double,
): String {
    val bmi = kg / (height * height)
    return when {
        bmi < 18.5 -> "under weight"
        bmi < 25 -> "normal weight"
        else -> "over weight"
    }
}

fun main() {
    val result1 = ff(70.1, 1.8)
    val result2 = ffWithWhen(70.1, 1.8)

    println(result1) // normal weight
    println(result2) // normal weight
}
