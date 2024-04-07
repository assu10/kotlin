package assu.study.kotlinme.chap03.extensionProperties

fun main() {
    val list: List<*> = listOf(1, 2, 3)
    val any: Any? = list[0]
    println(any)    // 1

    // Type mismatch. Required:Int  Found:Any?
    //val a: Int = list[0]
}