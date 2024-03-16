package assu.study.kotlin_me.chap02

class Contact(val name: String, val phone: String) {
    override fun toString(): String {
        return "Contact('$name', '$phone')"
    }
}

fun main() {
    val assu = Contact("Assu", "111-2222-3333")
    val silby = Contact("Silby", "555-6666-7777")

    val contacts = mapOf(
        assu.phone to assu,
        silby.phone to silby
    )

    println(contacts["111-2222-3333"])  // Contact('Assu', '111-2222-3333')
    println(contacts["555-6666-7777"])  // Contact('Silby', '555-6666-7777')
    println(contacts["000-0000-0000"])  // null
}