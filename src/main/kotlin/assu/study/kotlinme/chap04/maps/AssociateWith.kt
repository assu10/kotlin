package assu.study.kotlinme.chap04.maps

data class Person1(
    val name: String,
    val age: Int,
)

val names1 = listOf("Assu", "Sibly", "JaeHoon")
val ages1 = listOf(20, 2, 20)

fun people1(): List<Person1> = names1.zip(ages1) { name, age -> Person1(name, age) }

fun main() {
    // associateWith() 사용
    val map: Map<Person1, String> = people1().associateWith { it.name }

    // {Person1(name=Assu, age=20)=Assu, Person1(name=Sibly, age=2)=Sibly, Person1(name=JaeHoon, age=20)=JaeHoon}
    println(map)

    // associateBy() 사용, key 값이 유일함
    val map2: Map<String, Person1> = people1().associateBy { it.name }

    // {Assu=Person1(name=Assu, age=20), Sibly=Person1(name=Sibly, age=2), JaeHoon=Person1(name=JaeHoon, age=20)}
    println(map2)

    // associateBy() 사용, key 값이 중복되서 원본이 사라짐
    val map3: Map<Int, Person1> = people1().associateBy { it.age }

    // {20=Person1(name=JaeHoon, age=20), 2=Person1(name=Sibly, age=2)}
    println(map3)
}
