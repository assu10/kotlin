package assu.study.kotlinme.chap05.downcasting

interface Creature1

class Human1 : Creature1 {
    fun greeting(): String = "Human~"
}

class Dog1 : Creature1 {
    fun bark() = "Bark~"
}

class Cat1 : Creature1 {
    fun yaong() = "yaong~"
}

// 인자가 val (불변) 임
class SmartCast1(val c: Creature1) {
    fun contact(): String =
        when (c) {
            is Human1 -> c.greeting()
            is Dog1 -> c.bark()
            is Cat1 -> c.yaong()
            else -> "WHAT?"
        }
}

// 인자가 var(변경 가능) 임
class SmartCast2(var c: Creature1) {
    fun contact(): String =
        when (val c = c) { // 편의상 이렇게 했지만 추천하지 않음
            is Human1 -> c.greeting()
            is Dog1 -> c.bark()
            is Cat1 -> c.yaong()
            else -> "WHAT?"
        }

    // 모두 아래와 같은 컴파일 오류
    // Smart cast to 'Human1' is impossible,
    // because 'c' is a mutable property that could have been changed by this time
    // c 가 이 시점에서 변했을 수 있는 가변 프로퍼티이기 때문에 Human 으로 스마트 캐스트할 수 없다는 의미

    //    when (c) { // 편의상 이렇게 했지만 추천하지 않음
    //        is Human1 -> c.greeting()
    //        is Dog1 -> c.bark()
    //        is Cat1 -> c.yaong()
    //        else -> "WHAT?"
    //    }
}

fun main() {
    val c: Creature1 = Human1() // 업캐스트

    val result1 = SmartCast1(c).contact()
    val result2 = SmartCast1(Dog1()).contact() // 업캐스트가 일어남
    val result3 = SmartCast1(Cat1()).contact() // 업캐스트가 일어남

    val result4 = SmartCast2(c).contact()
    val result5 = SmartCast2(Dog1()).contact() // 업캐스트가 일어남
    val result6 = SmartCast2(Cat1()).contact() // 업캐스트가 일어남

    println(result1) // Human~
    println(result2) // Bark~
    println(result3) // yaong~
    println(result4) // Human~
    println(result5) // Bark~
    println(result6) // yaong~
}
