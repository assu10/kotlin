package assu.study.kotlin_me.chap03

fun main() {
    val poem = """
        |->첫 번째 줄인데요,
        |->두 번째 줄이에요
    """

    // | 가 marginPrefix 의 디폴트 인자값임
    val result1 = poem.trimMargin()
    // ->첫 번째 줄인데요,
    // ->두 번째 줄이에요
    println(result1)

    // marginPrefix 의 디폴트 인자값인 | 를 |-> 로 변경함
    val result2 = poem.trimMargin(marginPrefix = "|->")
    // 첫 번째 줄인데요,
    // 두 번째 줄이에요
    println(result2)
}