package assu.study.kotlinme.chap05.classDelegation

interface Controls1 {
    fun up(velocity: Int): String

    fun down(velocity: Int): String
}

class SpaceShipControls1 : Controls1 {
    override fun up(velocity: Int): String = "up $velocity"

    override fun down(velocity: Int): String = "down $velocity"
}

class ExplicitControls : Controls1 {
    // SpaceShipControls1 의 인스턴스를 프로퍼티로 함
    private val controls = SpaceShipControls1()

    // 수동으로 위임 구현
    override fun up(velocity: Int): String = controls.up(velocity)

    // 변형한 구현
    override fun down(velocity: Int): String = controls.down(velocity) + "...!!!"
}

fun main() {
    val controls = ExplicitControls()

    val result1 = controls.up(1)
    val result2 = controls.down(2)
    println(result1) // up 1
    println(result2) // down 2...!!!
}
