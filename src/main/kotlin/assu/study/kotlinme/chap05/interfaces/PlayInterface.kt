package assu.study.kotlinme.chap05.interfaces

// 프로퍼티를 선언하는 인터페이스
interface Player {
    val symbol: Char
}

// 항상 인터페이스의 프로퍼티를 오버라이드 해야함
class Food : Player {
    // 프로퍼티 값을 직접 다른 값으로 변경함
    override val symbol = '.'
}

class Robot : Player {
    // 값을 반환하는 커스텀 getter 사용
    override val symbol get() = 'R'
}

// 생성자 인자 목록에서 프로퍼티를 오버라이드함
class Wall(override val symbol: Char) : Player

fun main() {
    val result1 =
        listOf(Food(), Robot(), Wall('|'))

    val result2 =
        listOf(Food(), Robot(), Wall('|'))
            .map { it.symbol }

    println(result1) // [assu.study.kotlinme.chap05.Food@6e2c634b, assu.study.kotlinme.chap05.Robot@37a71e93, assu.study.kotlinme.chap05.Wall@7e6cbb7a]
    println(result2) // [., R, |]
}
