package assu.study.kotlinme.chap02

fun main() {
    val list = listOf(2, 2, 1, 1, 3)
    val set2 = list.toSet()
    println(list) // [2,2,1,1,1]
    println(set2) // [2,1,3]

    val list2 = list.distinct()
    println(list2) // [2,1,3]

    val set3 = "baacc".toSet()
    val set4 = setOf('b', 'a', 'c')
    val result = set3 == set4
    println(result) // true
}
