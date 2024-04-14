package assu.study.kotlinme.chap05

// 단일 추상 메서드 (SAM) 인터페이스
fun interface Action {
    fun act()
}

fun delayAction(action: Action) {
    print("Delay..")
    action.act()
}

fun main() {
    // 람다를 SAM 인터페이스가 필요한 곳에 직접 넘김
    // 즉, Action 인터페이스를 구현하는 객체 대신에 람다를 바로 전달함
    val result1 = delayAction { println("hi") } // Delay..hi
    println(result1) // kotlin.Unit
}
