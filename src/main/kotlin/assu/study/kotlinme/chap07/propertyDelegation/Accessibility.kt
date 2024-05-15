package assu.study.kotlinme.chap07.propertyDelegation

import kotlin.properties.ReadOnlyProperty

class Person(
    private val first: String,
    private val last: String,
) {
    val name by // SAM 변환
        ReadOnlyProperty<Person, String> { _, _ -> "$first $last~" }
}

fun main() {
    val assu = Person("A", "B")

    println(assu.name) // A B~
}
