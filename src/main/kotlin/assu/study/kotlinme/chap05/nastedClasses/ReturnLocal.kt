package assu.study.kotlinme.chap05.nastedClasses

interface Amphibian

fun createAmphibian(): Amphibian {
    // Local 클래스인 Frog 를 반환하기 위해 클래스 밖에서 정의한 인터페이스인 Amphibian 으로 업캐스트
    class Frog : Amphibian
    return Frog()
}

fun main() {
    val amphibian = createAmphibian()
    println(amphibian) // assu.study.kotlinme.chap05.nastedClasses.ReturnLocalKt$createAmphibian$Frog@4f3f5b24

    // createAmphibian() 외부에서는 Frog 를 알지 못하기 때문에 업캐스트 불가
    // amphibian as Frog
}
