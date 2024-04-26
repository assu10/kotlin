package assu.study.kotlinme.chap05.downcasting

interface Creature

class Human : Creature {
    fun greeting(): String = "Human~"
}

class Dog : Creature {
    fun bark() = "Bark~"
}

class Cat : Creature {
    fun yaong() = "yaong~"
}

// 이미 업캐스트된 Creature 를 받아서 정확한 타입을 찾음
// 이 후 Creature 객체를 상속 계층에서 정확한 타입, 정확한 파생 클래스로 다운캐스트함
fun what(c: Creature): String =
    when (c) {
        is Human -> c.greeting()
        is Dog -> c.bark()
        is Cat -> c.yaong()
        else -> "WHAT?"
    }

fun main() {
    val c: Creature = Human() // 업캐스트

    val result1 = what(c)
    val result2 = what(Dog()) // 업캐스트가 일어남
    val result3 = what(Cat()) // 업캐스트가 일어남

    class Who : Creature // 업캐스트

    val result4 = what(Who())

    println(result1) // Human~
    println(result2) // Bark~
    println(result3) // yaong~
    println(result4) // WHAT?
}
