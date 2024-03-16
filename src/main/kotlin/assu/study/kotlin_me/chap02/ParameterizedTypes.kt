package assu.study.kotlin_me.chap02

fun main() {
    // 타입을 추론함
    val numbers = listOf(1, 2, 3, "a")

    // 타입을 명시함
    // val numbers2: List<Int> = listOf(1, 2, 3, "a") //오류

    // 처음에 아무 요소도 없게 정의할 때는 어느 타입의 원소를 담을 지 정의해야 함
//    val list = mutableListOf<Int>()
//
//    list.add(1)
//    list.addAll(listOf(2, 3))
//
//    println(list)   // [1, 2, 3]
//
//    list += 4
//    list += listOf(5, 6)    // [1, 2, 3, 4, 5, 6]
//
//    println(list)

    //
    val list = getList()
    // list += 5    // 오류

}

// 내부적으로는 가변의 리스트를 리턴하도록 되어있지만 결과 타입이 List<Int> 로 바뀔 때 읽기 전용으로 다시 변경됨
fun getList(): List<Int> {
    return mutableListOf(1, 2)
}