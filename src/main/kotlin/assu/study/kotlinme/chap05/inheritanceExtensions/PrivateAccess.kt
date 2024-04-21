package assu.study.kotlinme.chap05.inheritanceExtensions

class Z(var i: Int = 0) {
    private var j = 0

    fun incr() {
        i++
        j++
    }
}

fun Z.decr() {
    i--
    // private 멤버 변수이므로 접근 불가
    // j--
}
