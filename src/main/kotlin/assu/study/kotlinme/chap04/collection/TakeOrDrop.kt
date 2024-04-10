package assu.study.kotlinme.chap04.collection

fun main() {
    val list1 = listOf('a', 'b', 'c', 'X', 'z')
    val list2 = listOf('a', 'b', 'c', 'X', 'Z')

    var result1 = list1.takeLast(3)
    println(result1) // [c, X, z]

    var result2 = list1.takeLastWhile { it.isUpperCase() }
    var result3 = list2.takeLastWhile { it.isUpperCase() }
    println(result2) // []
    println(result3) // [X, Z]

    var result4 = list1.drop(1)
    println(result4) // [b, c, X, z]

    var result5 = list1.dropWhile { it.isUpperCase() }
    var result6 = list2.dropWhile { it.isUpperCase() }
    println(result5) // [a, b, c, X, z]
    println(result6) // [a, b, c, X, Z]

    var result7 = list1.dropWhile { it.isLowerCase() }
    var result8 = list2.dropWhile { it.isLowerCase() }
    println(result7) // [X, z]
    println(result8) // [X, Z]
}
