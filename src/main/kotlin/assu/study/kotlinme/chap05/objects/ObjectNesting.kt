package assu.study.kotlinme.chap05.objects

object Outer {
    // object 안에 내포된 object
    object Nested {
        val a = "Outer.Nested.a"
    }
}

class HasObject {
    // 클래스 안에 내포된 object
    object Nested {
        val a = "HasObject.Nested.a"
    }
}

fun main() {
    println(Outer.Nested.a) // Outer.Nested.a
    println(HasObject.Nested.a) // HasObject.Nested.a
}
