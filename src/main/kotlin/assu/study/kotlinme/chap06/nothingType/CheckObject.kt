package assu.study.kotlinme.chap06.nothingType

class BadData(m: String) : Exception(m)

fun checkObject(obj: Any?): String =
    if (obj is String) {
        obj
    } else {
        throw BadData("Need String, got $obj")
    }

fun testObj(checkObj: (obj1: Any?) -> String) {
    println(checkObj("abc")) // abc

    // Exception in thread "main" assu.study.kotlinme.chap06.nothingType.BadData: Need String, got null
    // println(checkObj(null))

    // Exception in thread "main" assu.study.kotlinme.chap06.nothingType.BadData: Need String, got 111
    println(checkObj(111))
}

fun main() {
    testObj(::checkObject)
}
