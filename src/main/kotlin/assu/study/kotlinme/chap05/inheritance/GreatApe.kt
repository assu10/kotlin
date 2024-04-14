package assu.study.kotlinme.chap05.inheritance

open class GreatApe {
    val weight = 100.0
    val age = 12
}

open class AAA : GreatApe()

class BBB : GreatApe()

// 2단계 상속 (GreatApe - AAA - CCC)
class CCC : AAA()

// GreatAge 의 확장 함수
fun GreatApe.info() = "wt: $weight, age: $age"

fun main() {
    println(GreatApe().info()) // wt: 100.0, age: 12
    println(AAA().info()) // wt: 100.0, age: 12
    println(BBB().info()) // wt: 100.0, age: 12
    println(CCC().info()) // wt: 100.0, age: 12
}
