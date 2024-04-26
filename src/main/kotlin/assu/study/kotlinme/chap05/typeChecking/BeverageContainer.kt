package assu.study.kotlinme.chap05.typeChecking

interface BeverageContainer {
    fun open(): String

    fun pour(): String
}

class Can : BeverageContainer {
    override fun open() = "Can Open~"

    override fun pour() = "Can Pour~"
}

open class Bottle : BeverageContainer {
    override fun open() = "Bottle Open~"

    override fun pour() = "Bottle Pour~"
}

class GlassBottle : Bottle()

class PlasticBottle : Bottle()

fun BeverageContainer.recycle() =
    when (this) {
        is Can -> "Recycle can~"
        is GlassBottle -> "Recycle Glass bottle~"
        else -> "Landfill"
    }

fun main() {
    val refrigerator = listOf(Can(), Bottle(), GlassBottle(), PlasticBottle())

    val result1 = refrigerator.map { it.open() }
    var result2 = refrigerator.map { it.recycle() }

    println(result1) // [Can Open~, Bottle Open~, Bottle Open~, Bottle Open~]
    println(result2) // [Recycle can~, Landfill, Recycle Glass bottle~, Landfill]
}
