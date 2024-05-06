package assu.study.kotlinme.chap07.scopeFunctions

data class Tag(var n: Int = 0) {
    var s: String = ""

    fun incr() = ++n
}

fun main() {
    // let() 사용 (this 로 객체 접근 불가)
    // 객체를 it 으로 접근하고, 람다의 마지막 식의 값을 반환
    val result1 =
        Tag(1).let {
            it.s = "let: ${it.n}"
            it.incr()
        }

    // let() 을 사용하면서 람다 인자에 이름을 붙임
    val result2 =
        Tag(2).let { tag ->
            tag.s = "let: ${tag.n}"
            tag.incr()
        }

    // run() 사용 (it 으로 객체 접근 불가)
    // 객체를 this 로 접근하고, 람다의 마지막 식의 값을 반환
    val result3 =
        Tag(3).run {
            s = "run: $n" // 암시적 this
            incr()
        }

    // with() 사용 (it 으로 객체 접근 불가)
    // 객체를 this 로 접근하고, 람다의 마지막 식을 반환
    val result4 =
        with(Tag(4)) {
            s = "with: $n"
            incr()
        }

    // apply() 사용 (it 으로 객체 접근 불가)
    // 객체를 this 로 접근하고, 변경된 객체를 다시 반환
    val result5 =
        Tag(5).apply {
            s = "apply: $n"
            incr()
        }

    // also() 사용 (this 로 객체 접근 불가)
    // 객체를 it 으로 접근하고, 변경된 객체를 다시 반환
    val result6 =
        Tag(6).also {
            it.s = "also: $it.n"
            it.incr()
        }

    // also() 에서도 람다의 인자에 이름을 붙일 수 있음
    val result7 =
        Tag(7).also { tag ->
            tag.s = "also: $tag.n"
            tag.incr()
        }

    println(result1) // 2
    println(result2) // 3
    println(result3) // 4
    println(result4) // 5
    println(result5) // Tag(n=6)
    println(result6) // Tag(n=7)
    println(result7) // Tag(n=8)
}
