package assu.study.kotlinme.chap03.dataclass

data class Assu(
    val name: String,
    val number: String,
)

fun main() {
    val assu = Assu("assu", "010-111-2222")
    val newAssu = assu.copy(name = "silby")

    println(assu) // Assu(name=assu, number=010-111-2222)
    println(newAssu) // Assu(name=silby, number=010-111-2222)
}
