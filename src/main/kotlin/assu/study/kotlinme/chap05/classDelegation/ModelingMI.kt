package assu.study.kotlinme.chap05.classDelegation

interface Rectangle {
    fun paint(): String
}

class ButtonImage(val width: Int, val height: Int) : Rectangle {
    override fun paint() = "painting button image($width, $height)"
}

interface Mouse {
    fun clicked(): Boolean

    fun hover(): Boolean
}

class UserInput : Mouse {
    override fun clicked() = true

    override fun hover() = true
}

// ButtonImage 와 UserInput 을 open 으로 정의해도 하위 타입을 정의할 때는
// 상위 타입 목록에 클래스를 하나만 넣을 수 있기 때문에 아래와 같이 사용 불가
// class Button: ButtonImage(), UserInput()

// 클래스 Button 은 Rectangle 인터페이스를 image 를 사용(by) 하여 구현하고, Mouse 인터페이스를 input 을 사용(by) 하여 구현함
class Button(
    val width: Int,
    val height: Int,
    var image: Rectangle = ButtonImage(width, height), // public 이면서 var 임
    private var input: Mouse = UserInput(),
) : Rectangle by image, Mouse by input

fun main() {
    val button = Button(10, 5)

    // 동적으로 ButtonImage 변경 가능
    button.image = ButtonImage(1, 2)

    val result1 = button.paint()
    val result2 = button.clicked()
    val result3 = button.hover()

    println(result1) // painting button image(10, 5)
    println(result2) // true
    println(result3) // true

    // 위임한 2개의 타입으로 업캐스트 가능
    val rectangle: Rectangle = button
    val mouse: Mouse = button

    val result4 = rectangle.paint()
    val result5 = mouse.clicked()
    val result6 = mouse.hover()

    println(result4) // painting button image(10, 5)
    println(result5) // true
    println(result6) // true
}
