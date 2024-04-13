package assu.study.kotlinme.chap04.fold

fun main() {
    val list = listOf(11, 13, 17, 19)

    // fold() 사용
    val result1 = list.fold(7) { acc, n -> acc + n }
    println(result1) // 67

    // runningFold() 사용
    val result2 = list.runningFold(7) { acc, n -> acc + n }
    println(result2) // [7, 18, 31, 48, 67]

    // reduce() 사용
    val result3 = list.reduce { acc, n -> acc + n }
    println(result3) // 60

    // runningReduce() 사용
    val result4 = list.runningReduce { acc, n -> acc + n }
    println(result4) // [11, 24, 41, 60]
}
