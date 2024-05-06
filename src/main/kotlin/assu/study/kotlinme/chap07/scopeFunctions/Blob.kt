package assu.study.kotlinme.chap07.scopeFunctions

// AutoCloseable 인터페이스 구현
data class Blob(val id: Int) : AutoCloseable {
    override fun toString() = "Blob($id)"

    override fun close() = println("Close $this")

    fun show() = println("$this")
}

fun main() {
    Blob(1).let { it.show() } // Blob(1)
    Blob(2).run { show() } // Blob(2)
    with(Blob(3)) { show() } // Blob(3)
    Blob(4).apply { show() } // Blob(4)
    Blob(5).also { it.show() } // Blob(5)

    // Blob(6)
    // Close Blob(6)
    Blob(6).use { it.show() }

    // 영역 함수를 사용하면서 자원 해제를 보장하고 싶다면 영역 함수를 use() 람다 안에 사용해야 함
    // Blob(7)
    // Close Blob(7)
    Blob(7).use { it.run { show() } }

    // 명시적으로 close() 호출
    // Blob(8)
    // Close Blob(8)
    Blob(8).apply { show() }.also { it.close() }

    // 명시적으로 close() 호출
    // Blob(9)
    // Close Blob(9)
    Blob(9).also { it.show() }.apply { close() }

    // apply() 를 사용하고 그 결과를 use() 에 전달
    // 결과를 전달받은 use() 를 람다가 끝날 때 close() 호출
    // Blob(10)
    // Close Blob(10)
    Blob(10).apply { show() }.use {}
}
