package assu.study.kotlinme.chap05.inheritance

open class GreatApe1 {
    // private 로 선언하면 파생 클래스에서 energy 변경 불가
    protected var energy = 0

    open fun call() = "Hoo"

    open fun eat() {
        energy += 10
    }

    fun climb(x: Int) {
        energy -= x
    }

    fun energyLevel() = "Energy: $energy"
}

class AAA1 : GreatApe1() {
    override fun call() = "AAA!"

    override fun eat() {
        // 기반 클래스의 프로퍼티 변경
        energy += 10
        // 기반 클래스의 함수 호출
        super.eat()
    }

    // 햠수 추가
    fun run() = "AAA run"
}

class AAA2 : GreatApe1() {
    override fun call() = "AAA!"

    override fun eat() {
        // 기반 클래스의 프로퍼티 변경
        energy += 10
        // 기반 클래스의 함수를 호출하지 않음
        // super.eat()
    }

    // 햠수 추가
    fun run() = "AAA run"
}

class BBB1 : GreatApe1() {
    // 새로운 프로퍼티 선언
    val addEnergy = 20

    override fun call() = "BBB!"

    override fun eat() {
        energy += addEnergy
        super.eat()
    }

    // 함수 추가
    fun jump() = "BBB jump"
}

fun talk(ape: GreatApe1): String {
    // 둘 다 GreatApe1 의 함수가 아니므로 호출 불가
    // ape.run()
    // ape.jump()

    ape.eat()
    ape.climb(10)

    // 이렇게 리턴하면 객체의 주소가 나옴
    // assu.study.kotlinme.chap05.inheritance.GreatApe1@34c45dca.call() assu.study.kotlinme.chap05.inheritance.GreatApe1@34c45dca.energyLevel()
    // return "$ape.call() $ape.energyLevel()"

    // Hoo Energy: 0
    return "${ape.call()} ${ape.energyLevel()}"
}

fun main() {
    // energy 에 접근 불가
    // println(GreatApe1.energy)

    val result1 = talk(GreatApe1())
    val result2 = talk(AAA1())
    val result3 = talk(AAA2())
    val result4 = talk(BBB1())

    println(result1) // Hoo Energy: 0
    println(result2) // AAA! Energy: 10
    println(result3) // AAA! Energy: 0
    println(result4) // BBB! Energy: 20
}
