package assu.study.kotlinme.chap04.localFunctions

fun main() {
    val result =
        sessions.any { session ->
            // 람다가 main() 을 반환시키면 안되므로 반드시 Label 을 붙여서 람다만 반환시켜야 함
            return@any session.title.contains("Hap") && session.speaker in favoriteSpeakers
        }

    println(result) // true
}
