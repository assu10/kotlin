package assu.study.kotlinme.chap03.generics

data class Automobile(val brand: String)

// Automobile 밖에 받지 못하므로 재사용성이 좋지 않음
class RigidHolder(private val a: Automobile) {
    fun getValue() = a
}

fun main() {
    val holder = RigidHolder(Automobile("BMW"))
    println(holder.getValue())  // Automobile(brand=BMW)
}