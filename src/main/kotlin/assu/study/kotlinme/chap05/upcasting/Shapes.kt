package assu.study.kotlinme.chap05.upcasting

interface Shape {
    fun draw(): String

    fun erase(): String
}

class Circle : Shape {
    override fun draw(): String = "circle.draw"

    override fun erase(): String = "circle.erase"
}

class Square : Shape {
    override fun draw(): String = "square.draw"

    override fun erase(): String = "square.erase"

    fun color() = "Square.color"
}

class Triangle : Shape {
    override fun draw(): String = "triangle.draw"

    override fun erase(): String = "triangle.erase"

    fun rotate() = "Triangle.rotate"
}

// 기반 클래스인 Shape 를 파라메터로 받으므로 show() 는 파생 클래스들의 타입을 모두 허용함
fun show(shape: Shape) {
    println("show: ${shape.draw()}")
}

fun trim(shape: Shape) {
    println("trim: ${shape.erase()}")
    println("trim: ${shape.draw()}")
    // 컴파일 되지 않음
    // println("trim: ${shape.color()}")
    // println("trim: ${shape.rotate()}")
}

fun main() {
    val result = listOf(Circle(), Square(), Triangle()).forEach(::show)

    // show: circle.draw
    // show: square.draw
    // show: triangle.draw
    // kotlin.Unit
    println(result)

    val result2: Shape = Square()
    // 컴파일되지 않음
    // println(result2.color())
}
