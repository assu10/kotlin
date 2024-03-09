package assu.study.kotlin_me.helloWorld

fun trueOrFalse(exp: Boolean): String {
    if (exp)
        return "TRUE~"
    else
        return "FALSE~"
}

fun trueOrFalse2(exp: Boolean): String =
    if (exp)
        "TRUE~"
    else
        "FALSE~"


fun main() {
    val a = 1

    println(trueOrFalse(a < 3))
    println(trueOrFalse(a > 3))

    println(trueOrFalse2(a < 3))
    println(trueOrFalse2(a > 3))

    // if 식도 식이기 때문에 결과를 만들어내고, 이 결과를 val, var 에 저장 가능
    val result = if (1 < 2) 'a' else 'b'
    println(result) // a
}