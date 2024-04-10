package assu.study.kotlinme.chap04.maps

data class Person(
    val name: String,
    val age: Int,
)

val names = listOf("Assu", "Sibly", "JaeHoon")
val ages = listOf(20, 2, 20)

fun people(): List<Person> = names.zip(ages) { name, age -> Person(name, age) }

fun main() {
    // groupBy() 로 Map 생성
    val map: Map<Int, List<Person>> =
        people().groupBy(Person::age)

    // {20=[Person(name=Assu, age=20), Person(name=JaeHoon, age=20)], 2=[Person(name=Sibly, age=2)]}
    println(map)

    // [Person(name=Assu, age=20), Person(name=JaeHoon, age=20)]
    println(map[20])

    // null
    println(map[9])
}
