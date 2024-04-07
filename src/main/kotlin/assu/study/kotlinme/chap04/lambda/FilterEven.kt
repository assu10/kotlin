package assu.study.kotlinme.chap04.lambda

// 짝수 필터
fun filterEven(nums: List<Int>): List<Int> {
    val result = mutableListOf<Int>();
    for (i in nums) {
        if (i % 2 == 0) {
            result += i
        }
    }
    return result
}

// 2보다 큰 수만 필터
fun filterGreaterThanTwo(nums: List<Int>): List<Int> {
    val result = mutableListOf<Int>();
    for (i in nums) {
        if (i > 2) {
            result += i
        }
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3, 4)
    val evens = filterEven(list)
    val greaterThanTwo = filterGreaterThanTwo(list)

    println(evens)  // [2, 4]
    println(greaterThanTwo) // [3, 4]
}