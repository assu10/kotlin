package assu.study.kotlinme.chap05.baseClassInit

open class GreatApe(
    val weight: Double,
    val age: Int,
)

open class AAA(weight: Double, age: Int) : GreatApe(weight, age)

class BBB(weight: Double, age: Int) : GreatApe(weight, age)

// 2단계 상속 (GreatApe - AAA - CCC)
class CCC(weight: Double, age: Int) : AAA(weight, age)

// GreatApe 의 확장 함수
fun GreatApe.info() = "wt: $weight, age: $age"

fun main() {
    println(GreatApe(100.0, 12).info()) // wt: 100.0, age: 12
    println(AAA(110.1, 13).info()) // wt: 110.1, age: 13
    println(BBB(120.1, 14).info()) // wt: 120.1, age: 14
    println(CCC(130.1, 15).info()) // wt: 130.1, age: 15
}
