package assu.study.kotlinme.chap03.dataclass

class Person(val name: String)

data class Contact(val name: String)

fun main() {
    val result1 = Person("Assu")
    val result2 = Person("Assu")

    // 위 2개의 일반 클래스는 같지 않음
    println(result1.equals(result2)) // false
    println(result1) // assu.study.kotlin_me.chap03.dataclass.Person@10f87f48

    val result3 = Contact("Assu")
    val result4 = Contact("Assu")

    // 위 2개의 데이터 클래스는 같음
    println(result3.equals(result4)) // true
    println(result3) // Contact(name=Assu)
}
