package assu.study.kotlinme.chap07.usingOperators

fun main() {
    val list1 = MutableList(10) { 'a' + it }
    val list2 = MutableList(10) { it }

    println(list1) // [a, b, c, d, e, f, g, h, i, j]
    println(list2) // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    val result1 = list1[7] // operator get()
    val result2 = list1.get(8) // 명시적 호출

    list1[9] = 'x' // operator set()
    list1.set(9, 'x') // 명시적 호출

    val result3 = ('d' in list1) // operator contains()
    val result4 = list1.contains('d') // 명시적 호출

    println(result1) // h
    println(result2) // i
    println(result3) // true
    println(result4) // true
}
