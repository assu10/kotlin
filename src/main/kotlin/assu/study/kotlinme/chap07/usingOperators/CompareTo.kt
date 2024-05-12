package assu.study.kotlinme.chap07.usingOperators

// Comparable 인터페이스 구현 후 compareTo() 오버라이드
data class Contact(val name: String, val mobile: String) : Comparable<Contact> {
    override fun compareTo(other: Contact): Int = name.compareTo(other.name)
}

fun main() {
    val assu = Contact("assu", "010-1111-1111")
    val silby = Contact("sibly", "010-2222-3333")
    val jaehun = Contact("jaehun", "010-3333-3333")

    val result1 = assu < silby
    val result2 = assu <= silby
    val result3 = assu > silby
    val result4 = assu >= silby

    println(result1) // true
    println(result2) // true
    println(result3) // false
    println(result4) // false

    val contacts = listOf(assu, silby, jaehun)

    val result5 = contacts.sorted()
    val result6 = contacts.sortedDescending()

    // // [Contact(name=assu, mobile=010-1111-1111), Contact(name=jaehun, mobile=010-3333-3333), Contact(name=sibly, mobile=010-2222-3333)]
    println(result5)

    // [Contact(name=sibly, mobile=010-2222-3333), Contact(name=jaehun, mobile=010-3333-3333), Contact(name=assu, mobile=010-1111-1111)]
    println(result6)
}
