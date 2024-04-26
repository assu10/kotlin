package assu.study.kotlinme.chap05.downcasting

interface Creature4

class Human4 : Creature4 {
    fun greeting(): String = "Human~"
}

class Dog4 : Creature4 {
    fun bark() = "Bark~"
}

class Cat4 : Creature4 {
    fun yaong() = "yaong~"
}

val group: List<Creature4> =
    listOf(
        Human4(),
        Human4(),
        Dog4(),
        Cat4(),
        Dog4(),
    )

fun main() {
    // group 에 Creature4 가 들어있으므로 find() 는 Creature4 를 반환함
    // 이 객체를 Dog4 로 다루려고 아래처럼 명시적으로 타입을 변환함
    // group 안에 Dog4 가 하나도 없으면 find() 가 null 을 반환하므로 결과를 null 이 될 수 있는 타입인 Dog4? 로 변환
    val result = group.find { it is Dog4 } as Dog4?

    // result 가 null 이 될 수 있는 타입이므로 안전한 호출 연산자를 사용
    println(result?.bark()) // Bark~
}
