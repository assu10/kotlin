package assu.study.kotlinme.chap07.usingOperators

class Duo(val x: Int, val y: Int) {
    operator fun component1(): Int {
        println("component1()~")
        return x
    }

    operator fun component2(): Int {
        println("component2()~")
        return y
    }
}

fun main() {
    val (a, b) = Duo(10, 20)

    // component1()~
    // component2()~
    // 10
    println(a)

    // component1()~
    //component2()~
    //20
    println(b)

    //component1()~
    //component2()~
    //10
    //20
    println(a)
    println(b)
}
