package assu.study.kotlinme.chap03.enums

enum class Direction(val notation: String) {
    North("N"),
    South("S"), // 세미 콜론이 꼭 필요함
    ;

    // 추가 멤버
    val opposite: Direction
        get() =
            when (this) {
                North -> South
                South -> North
            }
}

fun main() {
    // N
    println(Direction.North.notation)
    // South
    println(Direction.North.opposite)
    // South
    println(Direction.South.opposite.opposite)
    // N
    println(Direction.South.opposite.notation)
}
