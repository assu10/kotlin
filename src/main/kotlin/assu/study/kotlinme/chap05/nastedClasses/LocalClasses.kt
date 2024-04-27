package assu.study.kotlinme.chap05.nastedClasses

fun localClasses() {
    // Local 클래스
    open class Amphibian

    class Frog : Amphibian()

    val amphibian: Amphibian = Frog()
}
