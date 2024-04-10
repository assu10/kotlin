package assu.study.kotlinme.chap04.manipulatingLists

data class Person(
    val name: String,
    val id: Int,
)

fun main() {
    val names = listOf("Assu", "Silby")
    val ids = listOf(777, 888)

    val result1 = names.zip(ids)

    // [(Assu, 777), (Silby, 888)]
    println(result1)

    val result2 =
        // name.zip(ids) { ... } 는 name, id Pair 를 만든 후 람다를 각 Pair 에 적용
        names.zip(ids) { name, id ->
            Person(name, id)
        }

    // [Person(name=Assu, id=777), Person(name=Silby, id=888)]
    println(result2)
}
