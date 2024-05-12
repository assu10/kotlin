package assu.study.kotlinme.chap07.operatorOverloading

class K(var v: Int) {
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

    override fun toString(): String = "K($v)"
}

data class C(val c: MutableList<Int>) {
    override fun toString() = "C($c)"
}

operator fun C.contains(k: K) = k.v in c

operator fun C.get(i: Int): K = K(c[i])

operator fun C.set(
    i: Int,
    k: K,
) {
    c[i] = k.v
}

fun main() {
    val c = C(mutableListOf(2, 3))

    val result1 = (K(2) in c) // c.contains(K(2))
    val result2 = (K(4) in c) // c.contains(K(4))
    val result3 = c[1] // c.get(1)

    println(result1) // true
    println(result2) // false
    println(result3) // K(3)
    println(c.get(1)) // K(3)
    println(c) // C([2, 3])

    c[1] = K(4) // c.set(1, K(4))
    println(c) // C([2, 4])

    c.set(1, K(5))
    println(c) // C([2, 5])
}
