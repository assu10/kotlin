package assu.study.kotlinme.chap04.sequences

fun Int.isEven(): Boolean {
    println("$this - isEven(): $this%2")
    return this % 2 == 0
}

fun Int.square(): Int {
    println("$this - square(): $this*$this")
    return this * this
}

fun Int.lessThenTen(): Boolean {
    println("$this - lessThenTen(): $this<10")
    return this < 10
}

fun main() {
    val list = listOf(1, 2, 3, 4)

    // List 를 이용하여 filter(), map(), any() 사용
    list.filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThenTen)

    // 1 - isEven(): 1%2
    // 2 - isEven(): 2%2
    // 3 - isEven(): 3%2
    // 4 - isEven(): 4%2
    // 2 - square(): 2*2
    // 4 - square(): 4*4
    // 4 - lessThenTen(): 4<10

    // Sequence 를 이용하여 filter(), map(), any() 사용
    list.asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThenTen)

    // 1 - isEven(): 1%2
    // 2 - isEven(): 2%2
    // 2 - square(): 2*2
    // 4 - lessThenTen(): 4<10
}
