package assu.study.kotlinme.chap07.usingOperators

data class Person(val name: String, val age: Int) {
    // 컴파일러가 아래 두 함수를 생성해줌
    // fun component1() = name
    // fun component2() = age
}

fun main() {
    val person = Person("Assu", 20)

    // 구조 분해 대입
    val (name, age) = person

    // 위의 구조 분해 대입은 아래와 같음
    val name1 = person.component1()
    val age1 = person.component2()

    println(name) // Assu
    println(age) // 20
    println(name1) // Assu
    println(age1) // 20
}
