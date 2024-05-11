package assu.study.kotlinme.chap07.creatingGenerics

fun useList(list: List<Any>) {
    // 아래와 같은 오류
    // Cannot check for instance of erased type: List<String>
    // 소거된 타입인 List<String> 의 인스턴스를 검사할 수 없다는 의미
    // 타입 소거 때문에 실행 시점에 제네릭 타입의 타입 파라메터 타입을 검사할 수 없음
    // if (list is List<String>) {}
}

fun main() {
    val strings = listOf('a', 'b', 'c')
    val all: List<Any> = listOf(1, 2, 'd')
}
