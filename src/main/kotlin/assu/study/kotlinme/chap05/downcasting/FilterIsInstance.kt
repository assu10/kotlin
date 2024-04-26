package assu.study.kotlinme.chap05.downcasting

interface Creature5

class Human5 : Creature5 {
    fun greeting(): String = "Human~"
}

class Dog5 : Creature5 {
    fun bark() = "Bark~"
}

class Cat5 : Creature5 {
    fun yaong() = "yaong~"
}

val group2: List<Creature5> =
    listOf(
        Human5(),
        Human5(),
        Dog5(),
        Dog5(),
        Dog5(),
    )

fun main() {
    // 반환값의 모든 원소가 Dog5 임에도 불구하고 Creature5 의 List 를 반환함
    val result1: List<Creature5> = group2.filter { it is Dog5 }
    println(result1.size) // 3

    val result2: List<Creature5> = group2.filter { it is Cat5 }
    println(result2.size) // 0

    // 대상 타입인 Dog5 의 리스트를 반환
    val result3: List<Dog5> = group2.filterIsInstance<Dog5>()
    println(result3.size) // 3

    val result4: List<Cat5> = group2.filterIsInstance<Cat5>()
    println(result4.size) // 0

    // mapNotNull() 사용
    val result5: List<Creature5> = group2.mapNotNull { it as? Dog5 }
    println(result5.size) // 3

    val result6: List<Cat5> = group2.mapNotNull { it as? Cat5 }
    println(result6.size) // 0
}
