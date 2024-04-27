package assu.study.kotlinme.chap05.objects

open class Paint(private val color: String) {
    open fun apply() = "apply $color~"
}

// 다른 클래스를 상속한 object
object Acrylic : Paint("Red") {
    override fun apply() = "Acrylic, ${super.apply()}"
}

interface PaintPreparation {
    fun prepare(): String
}

// 다른 인터페이스를 상속한 object
object Prepare : PaintPreparation {
    override fun prepare() = "prepare~"
}

fun main() {
    val result1 = Prepare.prepare()
    val result2 = Paint("Green").apply()
    val result3 = Acrylic.apply()

    println(result1) // prepare~
    println(result2) // apply Green~
    println(result3) // Acrylic, apply Red~
}
