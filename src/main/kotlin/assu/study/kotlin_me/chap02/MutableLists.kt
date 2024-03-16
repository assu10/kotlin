package assu.study.kotlin_me.chap02

fun main() {
//    var list = listOf('x')  // 불변 리스트
//    list += 'Y' // 가변 리스트처럼 보임
//    println(list)   // [x, Y]

    var list1 = listOf('a')
    list1 += 'b'
    //list1.add('c')    // 오류
    println(list1)  // [a, b]


    val list2 = listOf('a')
//    list2 += 'b'    // 오류
//    list2.add('c')  // 오류

    var list3 = mutableListOf('a')
    list3 += 'b'
    list3.add('c')
    println(list3)  // [a, b, c]

    val list4 = mutableListOf('a')
    list4 += 'b'
    list4.add('c')
    println(list4)  // [a, b, c]
}