package assu.study.kotlinme.chap04.sequences

fun Int.isEven3(): Boolean {
    println("$this - isEven3(): $this%2")
    return this % 2 == 0
}

fun Int.square3(): Int {
    println("$this - square3(): $this*$this")
    return this * this
}

fun main() {
    val list = listOf(1, 2, 3, 4)

    println(
        list.asSequence()
            .filter(Int::isEven3)
            .map(Int::square3)
            .toList(),
    )

    // 1 - isEven3(): 1%2
    // 2 - isEven3(): 2%2
    // 2 - square3(): 2*2
    // 3 - isEven3(): 3%2
    // 4 - isEven3(): 4%2
    // 4 - square3(): 4*4
    // [4, 16]
}
