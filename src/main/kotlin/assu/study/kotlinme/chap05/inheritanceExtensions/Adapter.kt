package assu.study.kotlinme.chap05.inheritanceExtensions

// --- 라이브러리 시작 ---

// 타입을 정의함
interface LibType1 {
    fun f1()

    fun f2()
}

// 정의한 타입을 객체의 파라메터로 받음
fun utility11(lt: LibType1) {
    lt.f1()
    lt.f2()
}

// 정의한 타입을 객체의 파라메터로 받음
fun utility22(lt: LibType1) {
    lt.f2()
    lt.f1()
}

// --- 라이브러리 끝 ---

open class MyClass1 {
    fun g() = println("g()")

    fun h() = println("h()")
}

// fun useMyClass(mc: MyClass1) {
//    mc.g()
//    mc.h()
// }

// MyClassAdaptedForLib 를 만들기 위해 MyClass1 을 상속함
// LibType1 을 구현하기 때문에 utility11(), utility22() 에 해당 객체 타입 전달 가능
class MyClassAdaptedForLib : MyClass1(), LibType1 {
    override fun f1() = h()

    override fun f2() = g()
}

fun main() {
    val mc = MyClassAdaptedForLib()
    // h()
    // g()
    utility11(mc)

    // g()
    // h()
    utility22(mc)

    // g()
    // h()
    // useMyClass(mc)
}
