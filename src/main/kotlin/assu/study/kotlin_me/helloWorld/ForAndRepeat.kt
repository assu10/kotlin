package assu.study.kotlin_me.helloWorld

fun main() {
//    // 1~3 까지 루프
//    for (i in 1..3) {
//        println(i)
//    }
//
//    // 1~10 까지 루프 (10 포함)
//    val range1 = 1..10
//    println(range1) // 1..10
//
//
//    // 1~10 까지 루프 (10 미포함)
//    val range2 = 1..<10
//    val range3 = 1 until 10
//    println(range2) // 1..9
//    println(range3) // 1..9

//    showRange(1..5)
//    showRange(0 until 5)
//    showRange(5 downTo 1)
//    showRange(0..9 step 2)
//    showRange(0 until 10 step 3)
//    showRange(9 downTo 2 step 3)

    // 문자열 이터레이션
//    for (c in 'a'..'z') {
//        print(c)    // abcdefghijklmnopqrstuvwxyz
//    }

//    val str = "abc"
//    for (i in 0..str.lastIndex) {
//        print(str[i] + 1)   // bcd
//    }

    // 각 문자 이터레이션
//    for (ch in "Jnskhm  ") {
//        print(ch + 1)   // Kotlin!!
//    }

    // repeat
    repeat(3) {
        print("hello")  // hellohellohello
    }
}

fun showRange(r: IntProgression) {
    for (i in r) {
        print("$i ")
    }
    print(" // $r")
    println()
}