package assu.study.kotlinme.chap05.complexConstructors

class WithSecondary(i: Int) {
    init {
        println("Primary constructor: $i")
    }

    // 부생성자에서 다른 생성자를 호출(`this` 사용) 부분은 생성자 로직 앞에 위치해야 함
    // (생성자 본문이 다른 초기화 결과에 영향을 받을 수 있기 때문)
    // 따라서 다른 생성자 호출이 생성자 본문보다 앞에 있어야 함
    constructor(c: Char) : this(c - 'A') {
        println(c - 'A')
        println("Secondary constructor 1: $c")
    }

    constructor(s: String) :
        // 첫 번째 부생성자 호출
        this(s.first()) {
        println(s.first())
        println("Secondary constructor 2: $s")
    }

    // this 를 통해 주생성자를 호출하지 않기 때문에 아래 오류와 함께 컴파일되지 않음
    // Primary constructor call expected
//    constructor(f: Float) {
//        println("Secondary constructor3: $f")
//    }
}

fun main() {
    fun sep() = println("-".repeat(10))

    // 주생성자 호출
    WithSecondary(1)
    // Primary constructor: 1

    sep()

    // 첫 번째 부생성자 호출
    WithSecondary('D')
    // Primary constructor: 3
    // 3
    // Secondary constructor 1: D

    sep()

    // 두 번째 부생성자 호출
    WithSecondary("HiHi")
    // Primary constructor: 7
    // 7
    // Secondary constructor 1: H
    // H
    // Secondary constructor 2: HiHi
}
