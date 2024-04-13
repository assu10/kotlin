package assu.study.kotlinme.chap04.localFunctions

fun main() {
    fun interesting(session: Session): Boolean {
        return session.title.contains("Hap") && session.speaker in favoriteSpeakers
    }

    // 함수 참조를 사용하여 Local 함수 참조
    println(sessions.any(::interesting)) // true

    // Local 함수를 익명 함수로 변경
    val result =
        sessions.any(
            fun(session: Session): Boolean { // 익명 함수는 이름이 없는 함수처럼 보임, 이 익명 함수를 sessions.any() 의 인자로 전달
                return session.title.contains("Hap") && session.speaker in favoriteSpeakers
            },
        )
    println(result) // true
}
