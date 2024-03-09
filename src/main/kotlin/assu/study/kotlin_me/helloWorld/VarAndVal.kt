package assu.study.kotlin_me.helloWorld

fun main() {
    // var 는 가변
    var tmp1 = 11
    var tmp2 = 1.4
    var tmp3 = "hello world"

    tmp1 += 2

    println(tmp1)
    println(tmp2)
    println(tmp3)

    // val 는 불변
    val tmp11 = 11
    val tmp22 = 1.4

    //tmp11 += 2  // 오류, Val cannot be reassigned
}