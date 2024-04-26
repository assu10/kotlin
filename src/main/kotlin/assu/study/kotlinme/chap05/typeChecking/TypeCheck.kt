package assu.study.kotlinme.chap05.typeChecking

interface Shape {
    fun draw(): String
}

class Circle : Shape {
    override fun draw(): String = "circle: draw~"
}

class Square : Shape {
    override fun draw(): String = "square: draw~"

    fun rotate() = "square: rotate~"
}

fun turn(s: Shape) =
    when (s) {
        is Square -> s.rotate()
        else -> "none~"
    }

fun main() {
    val shapes = listOf(Circle(), Square())
    val result1 = shapes.map { it.draw() }
    val result2 = shapes.map { turn(it) }

    println(result1) // [circle: draw~, square: draw~]
    println(result2) // [none~, square: rotate~]
}
