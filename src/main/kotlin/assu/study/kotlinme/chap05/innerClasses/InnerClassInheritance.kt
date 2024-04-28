package assu.study.kotlinme.chap05.innerClasses

open class Egg {
    private var yolk = Yolk()

    open inner class Yolk {
        // 주생성자
        init {
            println("Egg.Yolk()~")
        }

        open fun f() = println("Egg.Yolk.f()~")
    }

    // 주생성자
    init {
        println("New Egg~")
    }

    fun insertYolk(y: Yolk) {
        yolk = y
    }

    fun g() {
        yolk.f()
    }
}

// Egg 클래스 상속
class BigEgg : Egg() {
    // Egg 의 inner class 인 Yolk 상속
    inner class Yolk : Egg.Yolk() {
        init {
            println("BigEgg.Yolk()~")
        }

        override fun f() = println("BigEgg.Yolk.f()~")
    }

    // 주생성자
    init {
        insertYolk(Yolk())
    }
}

fun main() {
    // Egg.Yolk()~
    // New Egg~
    // Egg.Yolk()~
    // BigEgg.Yolk()~
    // BigEgg.Yolk.f()~
    BigEgg().g()
}
