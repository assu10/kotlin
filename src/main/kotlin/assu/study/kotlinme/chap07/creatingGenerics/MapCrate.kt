package assu.study.kotlinme.chap07.creatingGenerics

class Car2 {
    override fun toString() = "Car2~"
}

open class Crate2<T>(private var contents: T) {
    fun put(item: T) {
        contents = item
    }

    // T 타입의 값이 결과로 나옴
    fun get(): T = contents
}

// 제네릭 확장 함수
// f() 를 입력 시퀀스의 모든 원소에 적용하여 얻은 값으로 이루어진 List 반환
fun <T, R> Crate2<T>.map2(f: (T) -> (R)): List<R> = listOf(f(get()))

fun main() {
    val result = Crate2(Car2()).map2 { it.toString() + "x" }

    println(result) // [Car2~x]
}
