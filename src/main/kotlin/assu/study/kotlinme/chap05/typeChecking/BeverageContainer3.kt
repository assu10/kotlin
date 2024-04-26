package assu.study.kotlinme.chap05.typeChecking

interface BeverageContainer3 {
    fun open(): String

    fun pour() = "pour~"

    fun recycle(): String
}

abstract class Can3 : BeverageContainer3 {
    override fun open() = "can open~"
}

class SteelCan3 : Can3() {
    // Can3 클래스가 abstract 이므로 recycle() 를 오버라이드 해야함
    override fun recycle() = "can recycle~"
}
