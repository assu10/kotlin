package assu.study.kotlinme.chap04.sequences

fun Int.isEven2(): Boolean {
    println("$this - isEven2(): $this%2")
    return this % 2 == 0
}

fun Int.square2(): Int {
    println("$this - square2(): $this*$this")
    return this * this
}

fun main() {
    val r =
        listOf(1, 2, 3, 4)
            .asSequence()
            .filter(Int::isEven2)
            .map(Int::square2)

    // r 을 String 으로 변환해도 최종 결과는 나오지 않음
    // 객체의 식별자만 나옴
    println(r) // kotlin.sequences.TransformingSequence@42110406

    // 객체의 식별자를 제거해서 보기 위해 내부 객체의 메모리 주소를 표현하는 @를 자르고 봄
    println(r.toString().substringBefore("@")) // kotlin.sequences.TransformingSequence
}
