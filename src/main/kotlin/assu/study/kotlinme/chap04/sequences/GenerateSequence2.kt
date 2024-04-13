package assu.study.kotlinme.chap04.sequences

fun main() {
    val list = mutableListOf("aaa", "bbb", "END", "ccc")

    // removeAt(0) 은 List 의 첫 번째 원소를 제거한 후 제거한 원소를 반환함
    // takeIf() 는 수신 객체(removeAt(0) 이 반환한 String) 가 Predicate 를 만족하면 수신 객체를 반환하고,
    // 만족하지 않으면 null 반환
    val seq = generateSequence { list.removeAt(0).takeIf { it != "END" } }

    println(seq) // kotlin.sequences.ConstrainedOnceSequence@2e0fa5d3
    println(seq.toList()) // [aaa, bbb]
}
