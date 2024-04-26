package assu.study.kotlinme.chap05.typeChecking

sealed class BeverageContainer2 {
    abstract fun open(): String

    abstract fun pour(): String
}

sealed class Can2 : BeverageContainer2() {
    override fun open() = "can open~"

    override fun pour() = "can pour~"
}

class SteelCan2 : Can2()

class AluminumCan2 : Can2()

sealed class Bottle2 : BeverageContainer2() {
    override fun open() = "bottle open~"

    override fun pour() = "bottle pour~"
}

class GlassBottle2 : Bottle2()

sealed class PlasticBottle2 : Bottle2()

class PetBottle2 : PlasticBottle2()

class HepBottle2 : PlasticBottle2()

fun BeverageContainer2.recycle() =
    when (this) {
        is Can2 -> "recycle can~"
        is Bottle2 -> "recycle bottle~"
    }

fun BeverageContainer2.recycle2() =
    when (this) {
        is Can2 ->
            when (this) {
                is SteelCan2 -> "recycle steel~"
                is AluminumCan2 -> "recycle aluminum~"
            }

        is Bottle2 ->
            when (this) {
                is GlassBottle2 -> "recycle glass~"
                is PlasticBottle2 ->
                    when (this) {
                        is PetBottle2 -> "recycle pet-bottle~"
                        is HepBottle2 -> "recycle hep-bottle~"
                    }
            }
    }

fun main() {
    val refrigerator =
        listOf(
            SteelCan2(),
            AluminumCan2(),
            GlassBottle2(),
            PetBottle2(),
            HepBottle2(),
        )

    val result1 = refrigerator.map { it.open() }
    val result2 = refrigerator.map { it.recycle() }
    val result3 = refrigerator.map { it.recycle2() }

    println(result1) // [can open~, can open~, bottle open~, bottle open~, bottle open~]
    println(result2) // [recycle can~, recycle can~, recycle bottle~, recycle bottle~, recycle bottle~]
    println(result3) // [recycle steel~, recycle aluminum~, recycle glass~, recycle pet-bottle~, recycle hep-bottle~]
}
