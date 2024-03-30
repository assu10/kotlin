package assu.study.kotlin_me.chap03.enums

// Size 정의가 들어있는 파일에서 Size 안의 이름을 Size 정의보다 먼저 임포트함
import assu.study.kotlin_me.chap03.enums.Size.LARGE
import assu.study.kotlin_me.chap03.enums.Size.SMALL

enum class Size {
    TINY, SMALL, LARGE
}

fun main() {
    // import 를 하고 나면 enum 이름을 한정시키지 않아도 됨
    println(SMALL)
    // SMALL

    // values() 를 사용하여 enum 의 값을 이터레이션함
    // values() 는 Array 를 반환하기 때문에 toList() 를 호출하여 배열을 List 로 만듬
    println(Size.values().toList())
    // [TINY, SMALL, LARGE]

    println(LARGE.ordinal)
    // 2
}