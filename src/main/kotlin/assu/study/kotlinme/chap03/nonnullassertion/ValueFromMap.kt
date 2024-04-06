package assu.study.kotlinme.chap03.nonnullassertion

fun main() {
    val map = mapOf(1 to "one")

    println(map[1]!!.uppercase()) // ONE
    println(map.getValue(1).uppercase()) // ONE

    // println(map[2]!!.uppercase()) // NPE

    // NoSuchElementException 과 같이 구체적인 예외를 던지는 것이 더 유용한 정보를 얻을 수 있음
    // println(map.getValue(2).uppercase()) // NoSuchElementException
}
