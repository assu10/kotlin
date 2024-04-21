package assu.study.kotlinme.chap05.classDelegation

interface Controls {
    fun up(velocity: Int): String

    fun down(velocity: Int): String
}

class SpaceShipControls : Controls {
    override fun up(velocity: Int): String = "up $velocity"

    override fun down(velocity: Int): String = "down $velocity"
}
