package assu.study.kotlinme.chap04.localFunctions

fun main() {
    // main() 안에 있는 Local 확장 함수
    // 이 Local 확장 함수는 main() 안에서만 사용 가능
    fun String.exclaim() = "$this!"

    println("Hi".exclaim())
}
