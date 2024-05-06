package assu.study.kotlinme.chap07.scopeFunctions

val functions =
    listOf(
        // 익명 함수
        fun(name: String?) {
            name
                ?.takeUnless { it.isBlank() } // name 이 빈 값이 아니면 name 리턴
                ?.let { println("$it in let()") }
        },
        fun(name: String?) {
            name
                ?.takeUnless { it.isBlank() }
                ?.run { println("$this in run()") }
        },
        fun(name: String?) {
            name
                ?.takeUnless { it.isBlank() }
                ?.apply { println("$this in apply()") }
        },
        fun(name: String?) {
            name
                ?.takeUnless { it.isBlank() }
                ?.also { println("$it in also()") }
        },
    )

fun main() {
    // 아무것도 출력되지 않음
    functions.forEach { it(null) }

    // 아무것도 출력되지 않음
    functions.forEach { it(" ") }

    // AHAHAHA in let()
    // AHAHAHA in run()
    // AHAHAHA in apply()
    // AHAHAHA in also()
    functions.forEach { it("AHAHAHA") }
}
