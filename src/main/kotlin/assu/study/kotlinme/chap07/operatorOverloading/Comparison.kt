package assu.study.kotlinme.chap07.operatorOverloading

class I(var v: Int) {
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

    override fun toString(): String = "I($v)"
}

operator fun I.compareTo(i: I): Int = v.compareTo(i.v)

fun main() {
    val a = I(2)
    val b = I(3)
    val c = I(3)

    val result1 = a < b // a.compareTo(b) < 0
    val result2 = a > b // a.compareTo(b) > 0
    val result3 = a <= b // a.compareTo(b) <= 0
    val result4 = a >= b // a.compareTo(b) >= 0

    val result5 = (b == c) // b.compareTo(c) == 0

    println(result1) // true
    println(result2) // false
    println(result3) // true
    println(result4) // false

    println(result5) // false
    println(b.compareTo(I(3))) // 0
}
