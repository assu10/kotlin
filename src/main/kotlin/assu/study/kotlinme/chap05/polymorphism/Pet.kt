package assu.study.kotlinme.chap05.polymorphism

open class Pet {
    open fun speak() = "Pet"
}

class Dog : Pet() {
    // 멤버 함수 오버라이드
    override fun speak(): String = "Bark!"
}

class Cat : Pet() {
    // 멤버 함수 오버라이드
    override fun speak(): String = "Meow~"
}

fun talk(pet: Pet) = pet.speak()

fun main() {
    println(talk(Dog())) // Bark!
    println(talk(Cat())) // Meow~
}
