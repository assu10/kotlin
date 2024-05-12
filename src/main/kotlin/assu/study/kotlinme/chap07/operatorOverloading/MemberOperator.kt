package assu.study.kotlinme.chap07.operatorOverloading

data class Num2(private val n: Int) {
    // 클래스의 멤버 함수로 연산자 오버로딩 사용
    operator fun plus(rval: Num2) = Num2(n + rval.n)
}

// 컴파일 오류
// Cannot access 'n': it is private in 'Num2'
// Num2 에서 n 이 private 이기 때문에 n 에 접근할 수 없다는 의미

// operator fun Num2.minus(rval: Num2) = Num2(n - rval.n)

fun main() {
    val result1 = Num2(1) + Num2(2)
    val result2 = Num2(1).plus(Num2(2))

    println(result1) // Num2(n=3)
    println(result2) // Num2(n=3)
}
