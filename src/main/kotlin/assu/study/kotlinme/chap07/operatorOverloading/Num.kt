package assu.study.kotlinme.chap07.operatorOverloading

data class Num(val n: Int)

// + 를 확장 함수로 추가
// + 연산자 오버로딩
operator fun Num.plus(rval: Num) = Num(n + rval.n)

fun main() {
    val result1 = Num(1) + Num(2)
    val result2 = Num(1).plus(Num(2))

    println(result1) // Num(n=3)
    println(result2) // Num(n=3)
}
