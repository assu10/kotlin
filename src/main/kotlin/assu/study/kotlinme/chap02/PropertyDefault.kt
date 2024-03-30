package assu.study.kotlinme.chap02

class Default {
    var i: Int = 0
        get() {
            println("get()")
            return field
        }
        set(value) {
            println("set()")
            field = value
        }
}

fun main() {
    val d = Default()
    d.i = 2 // set() 찍힘
    println(d.i) // get(), 2 찍힘
}
