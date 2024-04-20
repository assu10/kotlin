package assu.study.kotlinme.chap05.abstract

// name, list 프로퍼티에 저장된 값으로 구성됨
class IntList(val name: String) {
    val list = mutableListOf<Int>()
}

// 인터페이스 안에서 프로퍼티는 선언만 가능하고, 데이터 초기화는 불가함
interface CC {
    val name: String

    // 아래와 같은 컴파일 오류
    // Property initializers are not allowed in interfaces

    // val list = listOf(1)
}

fun main() {
    val ints = IntList("numbers")

    val result1 = ints.name
    ints.list += 1

    println(result1) // numbers
    println(ints) // assu.study.kotlinme.chap05.abstract.IntList@10f87f48
    println(ints.list) // [1]
}
