package assu.study.kotlinme.chap06.unitTesting

enum class Language {
    Kotlin,
    Java,
    Go,
    Python,
}

data class Leaner(
    val id: Int,
    val name: String,
    val surname: String,
    val language: Language,
)
