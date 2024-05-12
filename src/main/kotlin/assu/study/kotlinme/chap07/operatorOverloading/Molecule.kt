package assu.study.kotlinme.chap07.operatorOverloading

data class House(
    val id: Int = idCount++,
    var attached: House? = null,
) {
    // 동반 객체
    companion object {
        private var idCount = 0
    }

    // 연산자 오버로딩
    operator fun plus(other: House) {
        attached = other
    }
}

fun main() {
    val h1 = House()
    val h2 = House()

    // House 클래스에 plus() 연산자 오버로딩이 없으면 아래 수식은 오류남
    h1 + h2
    // h1.plus(h2)  // 위와 동일한 표현

    // Exception in thread "main" java.lang.StackOverflowError
    h2 + h1

    println(h1) // House(id=0, attached=House(id=1, attached=null))
    println(h2) // House(id=1, attached=null)
}
