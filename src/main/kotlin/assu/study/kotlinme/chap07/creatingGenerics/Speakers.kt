package assu.study.kotlinme.chap07.creatingGenerics

class Person {
    fun speak() = "Hi!"
}

class Dog {
    fun bark() = "Ruff!"
}

class Robot {
    fun comm() = "Beep!"
}

fun talk(speaker: Any) =
    when (speaker) {
        is Person -> speaker.speak()
        is Dog -> speaker.bark()
        is Robot -> speaker.comm()
        else -> "Not a talker!"
    }

fun main() {
    println(talk(Person())) // Hi!
    println(talk(Dog())) // Ruff!
    println(talk(Robot())) // Beep!
    println(talk(12)) // Not a talker!
}
