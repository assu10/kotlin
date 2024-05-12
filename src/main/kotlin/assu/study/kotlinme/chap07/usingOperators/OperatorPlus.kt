package assu.study.kotlinme.chap07.usingOperators

fun main() {
    val mutableList = mutableListOf(1, 2, 3) // 가변 컬렉션

    mutableList += 4 // operator plusAssign()
    mutableList.plusAssign(5) // 명시적 호출

    println(mutableList) // [1, 2, 3, 4, 5]
    // + 를 호출해도 기존 컬렉션은 변하지 않고, 새로운 컬렉션 반환
    println(mutableList + 99) // [1, 2, 3, 4, 5, 99]
    println(mutableList) // [1, 2, 3, 4, 5]

    val list = listOf(1) // 읽기 전용 컬렉션
    val newList = list + 2 // operator plus()

    println(list) // [1]
    println(newList) // [1, 2]

    val list3 = list.plus(3) // 명시적 호출
    println(list3) // [1, 3]

    // + 를 호출해도 기존 컬렉션은 변하지 않고, 새로운 컬렉션 반환
    println(list3 + 99) // [1, 3, 99]
    println(list3) // [1, 3]
}
