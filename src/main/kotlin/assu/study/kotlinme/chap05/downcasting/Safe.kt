package assu.study.kotlinme.chap05.downcasting

interface Creature3

class Dog3 : Creature3 {
    fun bark() = "Bark~"
}

class Cat3 : Creature3 {
    fun yaong() = "yaong~"
}

fun dogBarkSafe(c: Creature3) = (c as? Dog3)?.bark() ?: "Not a dog"

fun main() {
    val result1 = dogBarkSafe(Dog3())
    val result2 = dogBarkSafe(Cat3())

    println(result1) // Bark~
    println(result2) // Not a dog
}
