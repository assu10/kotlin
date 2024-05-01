package assu.study.kotlinme.chap06.nothingType

class BadData2(m: String) : Exception(m)

fun failWithBadData(obj: Any?): Nothing = throw BadData2("Need String, got $obj")

// 인자를 String 으로 변환할 수 있으면 String 으로 변환한 값을 돌려주고, 아니면 예외 던짐
fun checkObject2(obj: Any?): String = (obj as? String) ?: failWithBadData(obj)

fun testObj2(checkObj: (obj1: Any?) -> String) {
    println(checkObj("abc")) // abc

    // Exception in thread "main" assu.study.kotlinme.chap06.nothingType.BadData2: Need String, got null
    // println(checkObj(null))

    // Exception in thread "main" assu.study.kotlinme.chap06.nothingType.BadData2: Need String, got 111
    println(checkObj(111))
}

fun main() {
    testObj2(::checkObject2)
}
