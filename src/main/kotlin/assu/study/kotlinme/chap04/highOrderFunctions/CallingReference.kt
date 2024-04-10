package assu.study.kotlinme.chap04.highOrderFunctions

val hello: () -> String = { "Hello~" }
val sum: (Int, Int) -> Int = { x, y -> x + y }

fun main() {
    println(hello()) // Hello~
    println(sum(1, 2)) // 3
}
