package assu.study.kotlinme.chap03.safecallandelvis

class Person(
    val name: String,
    var friend: Person? = null,
)

fun main() {
    val assu = Person("Assu")

    // assu.friend 프로퍼티가 null 이므로 나머지 호출도 null 리턴
    println(assu.friend?.friend?.name) // null
    println(assu.friend?.name) // null

    val silby = Person("Silby")
    val kamang = Person("Kamang", silby)

    silby.friend = kamang

    println(silby.friend?.name) // Kamang
    println(silby.friend?.friend?.name) // Silby

    println(assu.friend?.friend?.name ?: "NONO") // NONO
    println(silby.friend?.name ?: "NONO2") // Kamang
    println(silby.friend?.friend?.name ?: "NONO2") // Silby
}
