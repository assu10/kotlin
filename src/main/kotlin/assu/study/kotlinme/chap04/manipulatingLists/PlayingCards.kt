package assu.study.kotlinme.chap04.manipulatingLists

import kotlin.random.Random

enum class Suit {
    Spade,
    Club,
    Hear,
    Diamond,
}

enum class Rank(val faceValue: Int) {
    Ace(1),
    Two(2),
    Three(3),
}

class Card(val rank: Rank, val suit: Suit) {
    override fun toString() = "$rank of ${suit}s."
}

val deck: List<Card> =
// flatMap() 이 아닌 map() 으로 하면 아래와 같은 컴파일 오류남
// Type mismatch. Required: List<Card>  Found: List<List<Card>>

    // 따라서 deck 이 List<Card> 가 되기 위해서는 여기서 map() 이 아닌 flatMap() 을 사용해야 함
    Suit.values().flatMap { suit ->
        Rank.values().map { rank -> // map() 은 List 4개를 생성하며, 각 List 는 각 Suit 에 대응함
            Card(rank, suit)
        }
    }

fun main() {
    val rand = Random(26)

    // 코틀린 Random 은 seed 가 같으면 항상 같은 난수 시퀀스를 내놓으므로 결과는 항상 동일함
    repeat(7) { println("'${deck.random(rand)}'") }
}
