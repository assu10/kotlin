package assu.study.kotlinme.chap03.generics

fun <T> List<T>.first(): T {
    if (isEmpty()) {
        throw NoSuchElementException("Empty~")
    }
    return this[0]
}

fun <T> List<T>.firstOrNull(): T? =
    if (isEmpty()) null else this[0]


fun main() {
    println(listOf(1, 2, 3).first())    // 1

    val i: Int? = listOf(1, 2, 3).firstOrNull()
    println(i)  // 1

    // Exception in thread "main" java.util.NoSuchElementException: Empty~
    // val i2: Int? = listOf<Int>().first()
    //  println(i2)

    val s: String? = listOf<String>().firstOrNull()
    println(s)  // null

    // Exception in thread "main" java.util.NoSuchElementException: Empty~
    //val s2: String? = listOf<String>().first()
    // println(s2)
}