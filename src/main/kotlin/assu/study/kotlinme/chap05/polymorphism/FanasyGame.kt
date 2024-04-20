package assu.study.kotlinme.chap05.polymorphism

abstract class Character(val name: String) {
    abstract fun play(): String
}

interface Fighter {
    fun fight() = "Fight!"
}

interface Magician {
    fun magic() = "Magic!"
}

class Warrior : Character("Warrior"), Fighter {
    override fun play() = fight()
}

open class Elf(name: String = "Elf") : Character(name), Magician {
    // 여기선 super.play() 가 안됨
    override fun play() = magic()
}

class FightElf : Elf("FightElf"), Fighter {
    override fun play() = super.play() + fight()
}

// 기반 클래스인 Character 의 확장 함수
fun Character.playTurn() = println(name + ": " + play())

fun main() {
    // 각 객체를 List 에 넣으면서 Character 로 업캐스트됨
    val character: List<Character> = listOf(Warrior(), Elf(), FightElf())

    // List 에 있는 Character() 에 대해 playTurn() 호출 시 캐릭터마다 다른 출력이 나옴
    character.forEach { it.playTurn() }
    // Warrior: Fight!
    // Elf: Magic!
    // FightElf: Magic!Fight!
}
