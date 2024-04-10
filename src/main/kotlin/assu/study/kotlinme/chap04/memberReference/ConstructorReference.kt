package assu.study.kotlinme.chap04.memberReference

data class Student(
    val id: Int,
    val name: String,
)

fun main() {
    val names = listOf("Assu", "Silby")

    // mapIndexed() 에 인덱스와 원솔ㄹ 명시적으로 생성자에 넘김
    val students =
        names.mapIndexed { index, name -> Student(index, name) }

    println(students) // [Student(id=0, name=Assu), Student(id=1, name=Silby)]

    // mapIndexed() 에 생성자 참조를 인자로 넘김
    val result = names.mapIndexed(::Student)
    println(result) // [Student(id=0, name=Assu), Student(id=1, name=Silby)]
}
