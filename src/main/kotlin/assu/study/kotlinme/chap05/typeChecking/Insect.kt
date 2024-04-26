package assu.study.kotlinme.chap05.typeChecking

// Any 를 수신 객체로 받은 후 ::class 를 통해 객체에 연관된 클래스 참조를 얻음
val Any.name
    get() = this::class.simpleName

interface Insect {
    fun walk() = "$name: walk~"

    fun fly() = "$name: fly~"
}

class HouseFly : Insect

class Flea : Insect {
    override fun fly() = throw Exception("Flea cannot fly.")

    fun crawl() = "Flea: crawl~"
}

fun Insect.basic() =
    walk() + " basic- " +
        if (this is Flea) {
            crawl()
        } else {
            fly()
        }

interface SwimmingInsect : Insect {
    fun swim() = "$name: swim~"
}

interface WaterWalker : Insect {
    fun walkWater() = "$name: walk on water~"
}

class WaterBeetle : SwimmingInsect

class WaterStrider : WaterWalker

class WhirligigBeetle : SwimmingInsect, WaterWalker

fun Insect.water() =
    when (this) {
        is SwimmingInsect -> swim()
        is WaterWalker -> walkWater()
        else -> "$name: drown."
    }

fun main() {
    val insects = listOf(HouseFly(), Flea(), WaterStrider(), WaterBeetle(), WhirligigBeetle())
    val result1 = insects.map { it.basic() }
    val result2 = insects.map { it.water() }

    // [HouseFly: walk~ basic- HouseFly: fly~, Flea: walk~ basic- Flea: crawl~,
    // WaterStrider: walk~ basic- WaterStrider: fly~, WaterBeetle: walk~ basic- WaterBeetle: fly~, WhirligigBeetle: walk~ basic- WhirligigBeetle: fly~]
    println(result1)

    // [HouseFly: drown., Flea: drown., WaterStrider: walk on water~, WaterBeetle: swim~, WhirligigBeetle: swim~]
    println(result2)
}
