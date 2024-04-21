package assu.study.kotlinme.chap05.classDelegation

interface Controls2 {
    fun up(velocity: Int): String

    fun down(velocity: Int): String
}

class SpaceShipControls2 : Controls2 {
    override fun up(velocity: Int): String = "up $velocity"

    override fun down(velocity: Int): String = "down $velocity"
}

// 클래스 DelegatedControls 는 Controls2 인터페이스를 controls 를 사용(by) 하여 구현함
class DelegatedControls(private val controls: SpaceShipControls2 = SpaceShipControls2()) : Controls2 by controls {
    override fun down(velocity: Int): String = controls.down(velocity) + "...!!!"
}

fun main() {
    val controls = DelegatedControls()

    val result1 = controls.up(1)
    val result2 = controls.down(2)

    println(result1) // up 1
    println(result2) // down 2...!!!
}
