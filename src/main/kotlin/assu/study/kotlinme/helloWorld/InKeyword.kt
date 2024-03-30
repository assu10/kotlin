package assu.study.kotlinme.helloWorld

fun main() {
//    val a = 11
//    println(a in 1..10) // false
//    println(a in 1..12) // true

//    val b = 35
//    // 아래 2개는 같은 의미
//    println(0 <= b && b <= 100) // true
//    println(b in 0..100)    // true

    // 이터레이션의 in 과 원소검사 in
//    val values = 1..3
//    for (v in values) {
//        println("iteration $v")
//    }
//
//    val v = 2
//    if (v in values)
//        println("$v is a member of $values")    // 2 is a member of 1..3

    println(isDigit('a')) // false
    println(isDigit('5')) // true
    println(notDigit('z')) // true
}

fun isDigit(ch: Char) = ch in '0'..'9'

fun notDigit(ch: Char) = ch !in '0'..'9'
