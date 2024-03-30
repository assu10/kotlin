package assu.study.kotlinme.chap02

class Assu(name: String)

class MutableNameAssu(var name: String)

class ImmutableNameAssu(val name: String)

class OverrideSample(val name: String) {
    override fun toString(): String {
        return "OverrideSample('$name')"
    }
}

fun main() {
//    val assu1 = Assu("assu")
//    val assu2 = MutableNameAssu("assu")
//    val assu3 = ImmutableNameAssu("assu")
//
//    //assu1.name = "silby"  // 오류
//    assu2.name = "silby"
//    //assu3.name = "sibly"  // 오류
//
//    //println(assu1.name)   // 오류
//    println(assu2.name) // silby
//    println(assu3.name) // assu

    val overrideSample = OverrideSample("assu")
    println(overrideSample) // OverrideSample('assu')
}
