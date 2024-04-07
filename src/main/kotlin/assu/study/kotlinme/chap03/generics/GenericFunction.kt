package assu.study.kotlinme.chap03.generics

fun <T> identity(arg: T): T = arg

fun main() {
    println(identity("AA")) // AA
    println(identity(1))    // 1

    // identity() 가 T 타입의 값을 반환하는 제네릭 함수이기 때문에 d 는 Dog 타입임
    var d: Dog = identity(Dog())
    println(d)  // assu.study.kotlinme.chap03.generics.Dog@27d6c5e0
}
