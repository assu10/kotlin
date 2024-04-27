package assu.study.kotlinme.chap05.nastedClasses

abstract class Cleanable(val id: String) {
    open val parts: List<Cleanable> = listOf()

    fun clean(): String {
        val text = "id is $id clean~"
        if (parts.isEmpty()) {
            return text
        }
        return "${
            parts.joinToString(
                separator = " ",
                prefix = "(",
                postfix = ")",
                transform = Cleanable::clean, // 각 요소를 변환하는 함수 지정
            )
        }~  $text~\n"
    }
}

class House : Cleanable("House") {
    override val parts =
        listOf(
            Bedroom("Master bedroom"),
            Bedroom("Guest bedroom"),
        )

    // 내포 클래스: 1 depth
    class Bedroom(id: String) : Cleanable(id) {
        override val parts = listOf(Closet(), Bathroom())

        // 내포 클래스: 2 depth
        class Closet : Cleanable("Closet") {
            override val parts = listOf(Shelf(), Shelf())

            // 내포 클래스: 3 depth
            class Shelf : Cleanable("Shelf")
        }

        // 내포 클래스: 2 depth
        class Bathroom : Cleanable("Bathroom") {
            override val parts = listOf(Toilet(), Sink())

            // 내포 클래스: 3 depth
            class Toilet : Cleanable("Toilet")

            // 내포 클래스: 3 depth
            class Sink : Cleanable("Sink")
        }
    }
}

fun main() {
    val result = House().clean()

    // (((id is Shelf clean~ id is Shelf clean~)~  id is Closet clean~~
    // (id is Toilet clean~ id is Sink clean~)~  id is Bathroom clean~~
    // )~  id is Master bedroom clean~~
    // ((id is Shelf clean~ id is Shelf clean~)~  id is Closet clean~~
    // (id is Toilet clean~ id is Sink clean~)~  id is Bathroom clean~~
    // )~  id is Guest bedroom clean~~
    // )~  id is House clean~~
    println(result)
}
