package assu.study.kotlinme.chap07.operatorOverloading

class E(var v: Int) {
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

    override fun toString(): String = "E($v)"
}

// 인텔리제이에서 자동으로 생성해주는 equals() 와 hashCode()
class T(var d: Int)

fun main() {
    val a1 = E(1)
    val a2 = E(2)
    val a3 = E(2)

    println(a1 == a2) // false, a1.equals(a2)
    println(a1 != a2) // true, !a1.equals(a2)
    println(a2 == a3) // true
    println(a2 != a3) // false

    // 참조 동등성
    println(a1 === a2) // false
    println(a2 === a3) // false
    println(a2 !== a3) // true
    println(E(1) === E(1)) // false
}
