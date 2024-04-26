package assu.study.kotlinme.chap05.typeChecking

interface Shape1 {
    fun draw(): String
}

class Circle1 : Shape1 {
    override fun draw(): String = "circle: draw~"
}

class Square1 : Shape1 {
    override fun draw(): String = "square: draw~"

    fun rotate() = "square: rotate~"
}

// 새로운 클래스 추가됨
class Triangle1 : Shape1 {
    override fun draw() = "triangle: draw~"

    fun rotate() = "triangle: rotate~"
}

fun turn(s: Shape1) =
    when (s) {
        is Square1 -> s.rotate()
        else -> "none~"
    }

// 새로운 함수 추가 필요
fun turn2(s: Shape1) =
    when (s) {
        is Square1 -> s.rotate()
        is Triangle1 -> s.rotate()
        else -> "none~"
    }

fun main() {
    val shapes = listOf(Circle1(), Square1(), Triangle1())
    val result1 = shapes.map { it.draw() }
    val result2 = shapes.map { turn(it) }
    val result3 = shapes.map { turn2(it) }

    println(result1) // [circle: draw~, square: draw~, triangle: draw~]
    println(result2) // [none~, square: rotate~, none~]
    println(result3) // [none~, square: rotate~, triangle: rotate~]
}
