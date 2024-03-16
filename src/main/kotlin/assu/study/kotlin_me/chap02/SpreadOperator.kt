package assu.study.kotlin_me.chap02

fun main() {
    val array = intArrayOf(1, 2)
    val result = sum(1, 2, 3, *array, 6)

    //val array2 = arrayOf(1, 2)
    //val result5 = sum(1, 2, 3, *array2, 6)  // 노류

    println(result) // 15

//    val result2 = sum(1,2,3,array,6)  // 오류

    val list = listOf(1, 2)
    // List 를 인자 목록으로 전달하고 싶을 경우 먼저 Array 로 변환한 다음 스프레드 연산자 사용
    val result2 = sum(*list.toIntArray())
    println(result2)    // 3
    //val result3 = sum(list.toIntArray())  // 오류
}