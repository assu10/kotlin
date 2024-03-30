package assu.study.kotlinme.chap02

class Hamster(val name: String)

class Cage(private val maxCapacity: Int) {
    private val hamsters = mutableListOf<Hamster>()

    // 내부에 저장된 상태가 없고 접근이 이루어질 때 결과를 계산해서 돌려줌
    val capacity: Int
        get() = maxCapacity - hamsters.size

    // 내부에 저장된 상태가 없고 접근이 이루어질 때 결과를 계산해서 돌려줌
    val full: Boolean
        get() = hamsters.size == maxCapacity

    fun put(hamster: Hamster): Boolean =
        if (full) {
            false
        } else {
            hamsters += hamster
            true
        }

    fun take(): Hamster = hamsters.removeAt(0)
}

fun main() {
    val cage = Cage(2)
    println(cage.full) // false

    println(cage.put(Hamster("Assu"))) // true
    println(cage.put(Hamster("Silby"))) // true
    println(cage.full) // true

    println(cage.capacity) // 0

    println(cage.put(Hamster("ddd"))) // false

    println(cage.take())

    println(cage.capacity) // 1
}
