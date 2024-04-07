package assu.study.kotlinme.chap04.lambda

var x = 100

// 일반 함수가 함수 밖에 요소를 capture 함
fun useX() {
    x++
}

fun main() {
    useX()
    println(x)  // 101
}