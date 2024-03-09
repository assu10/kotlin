package assu.study.kotlin_me.helloWorld

fun main() {
    val a = 42
    println("Found $a")
    println("Fount $1")
    //println("Fount $b")   // 오류

    val condition = true
    println(
        "${if (condition) 'a' else 'b'}"
    )   // a
    val x = 11
    println("$x + 4 = ${x+4}")  // 11 + 4 = 15

    val s = "my apple"
    println("s = \"$s\"~")  // s = "my apple"~
    println("""s = "$s"~""")
}