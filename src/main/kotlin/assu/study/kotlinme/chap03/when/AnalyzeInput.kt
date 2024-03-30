package assu.study.kotlinme.chap03.`when`

class Coordinates {
    var x: Int = 0
        set(value) {
            println("x get $value")
            field = value
        }
    var y: Int = 0
        set(value) {
            println("y get $value")
            field = value
        }

    override fun toString() = "($x, $y)"
}

fun progressInputs(inputs: List<String>) {
    val coordinates = Coordinates()
    for (input in inputs) {
        when (input) {
            "up", "u" -> coordinates.y-- // 콤마를 써서 여러 가지 값 나열 가능, up 혹은 u 가 들어올 때 실행됨
            "down", "d" -> coordinates.y++
            "left", "l" -> coordinates.x--
            "right", "r" -> {
                println("moving right")
                coordinates.x++
            }

            "nowhere" -> {} // 아무일도 하지 않을 경우엔 빈 중괄호 사용
            "exit" -> return
            else -> println("bad input: $input")
        }
    }
}

fun main() {
    val result = progressInputs(listOf("up", "d", "nowhere", "left", "right", "exit", "r"))

    println(result)
    // y get -1
    // y get 0
    // x get -1
    // moving right
    // x get 0
    // kotlin.Unit
}
