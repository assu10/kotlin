package assu.study.kotlinme.chap05.downcasting

interface Creature2

class Dog2 : Creature2 {
    fun bark() = "Bark~"
}

class Cat2 : Creature2 {
    fun yaong() = "yaong~"
}

fun dogBarkUnsafe(c: Creature2) = (c as Dog2).bark()

fun dogBarkUnsafe2(c: Creature2): String {
    c as Dog2 // `as` 로 선언해준 이후부터는 c 를 Dog2 객체처럼 사용 가능
    c.bark()

    return c.bark() + c.bark()
}

fun main() {
    val result1 = dogBarkUnsafe(Dog2())
    val result2 = dogBarkUnsafe2(Dog2())

    val result3 = dogBarkUnsafe(Cat2())
    val result4 = dogBarkUnsafe2(Cat2())

    println(result1)
    println(result2)

    println(result3)
    println(result4)
}
