package assu.study.kotlinme.chap07.creatingGenerics

// 기본 제네릭 클래스
class Box<T>(private var contents: T) {
    fun put(item: T) {
        contents = item
    }

    fun get(): T = contents
}

class InBox<in T>(private var contents: T) {
    fun put(item: T) {
        contents = item
    }

    // 컴파일 오류
    // Type parameter T is declared as 'in' but occurs in 'out' position in type T
    // fun get(): T = contents
}

class OutBox<out T>(private var contents: T) {
    // 컴파일 오류
    // Type parameter T is declared as 'out' but occurs in 'in' position in type T
//    fun put(item: T) {
//        contents = item
//    }

    fun get(): T = contents
}
