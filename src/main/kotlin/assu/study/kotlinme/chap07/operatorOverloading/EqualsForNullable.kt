package assu.study.kotlinme.chap07.operatorOverloading

class F(var v: Int) {
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

    override fun toString(): String = "F($v)"
}

// null 이 될 수 있는 객체를 if 문으로 검사
fun equalsWithIf(
    a: F?,
    b: F?,
) = if (a === null) {
    b === null
} else {
    a == b
}

// null 이 될 수 있는 객체를 엘비스 연산자로 검사
fun equalsWithElvis(
    a: F?,
    b: F?,
): Boolean = a?.equals(b) ?: (b === null)

fun main() {
    val a: F? = null
    val b = F(0)
    val c: F? = null

    val result1 = a == b
    val result2 = a == c

    val result3 = equalsWithIf(a, b)
    val result4 = equalsWithIf(a, c)

    val result5 = equalsWithElvis(a, b)
    val result6 = equalsWithElvis(a, c)

    println(result1) // false
    println(result2) // true
    println(result3) // false
    println(result4) // true
    println(result5) // false
    println(result6) // true
}
