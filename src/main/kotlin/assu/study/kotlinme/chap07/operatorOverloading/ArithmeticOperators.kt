package assu.study.kotlinme.chap07.operatorOverloading

class G(var v: Int) {
    override fun equals(other: Any?): Boolean =
        when {
            // === 는 참조 동등성 검사로, 메모리상에서 other 가 this 랑 같은 객체를 가리키는지 검사
            this === other -> true
            // other 의 타입이 현재 클래스 타입과 같은지 검사
            other !is E -> false
            // 저장된 데이터를 비교하는 검사, 이 시점에서 컴파일러는 other 의 타입이 E 라는 사실을 알기 때문에 별도의 타입 변환없이 other.v 사용 가능
            else -> v == other.v
        }

    // equals() 를 오버라이드할 때는 항상 hashCode() 도 오버라이드해야함
    override fun hashCode(): Int = v

    override fun toString(): String = "G($v)"
}

// 단항 연산자
operator fun G.unaryPlus() = G(v)

operator fun G.unaryMinus() = G(-v)

operator fun G.not() = this

// 증가/감소 연산자
operator fun G.inc() = G(v + 1)

operator fun G.dec() = G(v - 1)

fun unary(a: G) {
    // 위의 산술 연산자 오버로딩이 없으면 아래 수식들은 모두 오류남
    +a // unaryPlus()
    -a // unaryMinus()
    !a // not()

    var b = a
    b++ // inc() (var 에서만 가능)
    b-- // dec() (var 에서만 가능)
}

// 2항 연산자
operator fun G.plus(g: G) = G(v + g.v)

operator fun G.minus(g: G) = G(v - g.v)

operator fun G.times(g: G) = G(v * g.v)

operator fun G.div(g: G) = G(v / g.v)

operator fun G.rem(g: G) = G(v % g.v)

fun binary(
    a: G,
    b: G,
) {
    // 위의 산술 연산자 오버로딩이 없으면 아래 수식들은 모두 오류남
    a + b // a.plus(b)
    a - b // a.minus(b)
    a * b // a.times(b)
    a / b // a.div(b)
    a % b // a.rem(b)
}

// 복합 대입 연산자
operator fun G.plusAssign(g: G) {
    v += g.v
}

operator fun G.minusAssign(g: G) {
    v -= g.v
}

operator fun G.timesAssign(g: G) {
    v *= g.v
}

operator fun G.divAssign(g: G) {
    v /= g.v
}

operator fun G.remAssign(g: G) {
    v %= g.v
}

fun assignment(
    a: G,
    b: G,
) {
    a += b // a.plusAssign(b)
    a -= b // a.minusAssign(b)
    a *= b // a.timesAssign(b)
    a /= b // a.divAssign(b)
    a %= b // a.remAssign(b)
}

fun main() {
    val two = G(2)
    val three = G(3)
    println(two + three) // G(5)
    println(two.plus(three)) // G(5)
    println(two * three) // G(6)

    val t = true
    println(!t) // false

    val thirteen = G(13)
    println(thirteen / three) // G(4)
    println(thirteen % three) // G(1)

    val one = G(1)
    one += (three * three)
    println(one) // G(10)

    var four = G(4)
    // var 로 되어 있는 경우 컴파일 오류
    // Assignment operators ambiguity. All these functions match.
    // four += (three * three)
}
