package assu.study.kotlinme.chap07.extensionLambdas

val va: (String, Int) -> String = { str, n ->
    str.repeat(n) + str.repeat(n)
}

// 확장 람다
// String 파라메터를 괄호 밖으로 옮겨서 String.(Int) 처럼 확장 함수 구문 사용
// 확장 대상 객체(여기서는 String) 이 수신 객체가 되고, this 를 통해서 수신 객체에 접근 가능
val vb: String.(Int) -> String = {
    this.repeat(it) + repeat(it)
}

fun main() {
    val result1 = va("Assu", 2)
    val result2 = "Assu".vb(2)
    val result3 = vb("Assu", 2)

    // 컴파일되지 않음
    // val result4 = "Assu".va(2)

    println(result1) // AssuAssuAssuAssu
    println(result2) // AssuAssuAssuAssu
    println(result3) // AssuAssuAssuAssu
}
