package assu.study.kotlinme.chap04.collection

fun main() {
    val list = listOf(-3, -1, 0, 3, 5, 9)

    // filter(), count()
    val result1 = list.filter { it > 0 }
    val result2 = list.count { it > 0 }

    println(result1) // [3, 5, 9]
    println(result2) // 3

    // filterNotNull()
    val list2 = listOf(1, 2, null)
    println(list2.filterNotNull()) // [1, 2]

    // find(), firstOrNull(), lastOrNull()
    val result3 = list.find { it > 0 }

    val result4 = list.firstOrNull { it > 0 }
    val result5 = list.lastOrNull { it > 0 }
    val result6 = list.firstOrNull { it < 0 }
    val result7 = list.lastOrNull { it < 0 }

    println(result3) // 3

    println(result4) // 3
    println(result5) // 9
    println(result6) // -3
    println(result7) // -1

    // any()
    val result8 = list.any { it > 0 }
    val result9 = list.any { it != 0 }

    println(result8) // true
    println(result9) // true

    // all()
    val result10 = list.all { it > 0 }
    val result11 = list.all { it != 0 }

    println(result10) // false
    println(result11) // false

    // none()
    val result12 = list.none { it > 0 }
    val result13 = list.none { it == 0 }

    println(result12) // false
    println(result13) // false
}
