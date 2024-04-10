package assu.study.kotlinme.chap04.memberReference

fun Int.times12() = times(12)

class Dog

fun Dog.speak() = "Bow!"

fun goInt(
    n: Int,
    g: (Int) -> Int,
) = g(n)

fun goDog(
    dog: Dog,
    g: (Dog) -> String,
) = g(dog)

fun main() {
    val result1 = goInt(11, Int::times12)
    val result2 = goDog(Dog(), Dog::speak)

    println(result1) // 132 (11*12 이므로)
    println(result2) // Bow!
}
