package assu.study.kotlinme.chap04.lambda

fun main() {
    val list = listOf('a', 'b', 'c')
    val result = list.mapIndexed { index, _ -> "($index)" }
    val result2 = List(list.size) { index -> "($index)" }
    println(result) // [(0), (1), (2)]
    println(result2)    // [(0), (1), (2)]

    // List.indices() 사용
    val result3 = list.indices.map {
        "($it)"
    }
    println(result3)    // [(0), (1), (2)]
}