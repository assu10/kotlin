package assu.study.kotlinme.chap05.inheritanceExtensions

// --- 라이브러리 시작 ---

// 타입을 정의함
interface LibType2 {
    fun f1()

    fun f2()
}

// 정의한 타입을 객체의 파라메터로 받음
fun utility111(lt: LibType2) {
    lt.f1()
    lt.f2()
}

// 정의한 타입을 객체의 파라메터로 받음
fun utility222(lt: LibType2) {
    lt.f2()
    lt.f1()
}

// --- 라이브러리 끝 ---

// open 된 클래스가 아님 (= 상속 불가)
class MyClass2 {
    fun g() = println("g()")

    fun h() = println("h()")
}

fun useMyClass2(mc: MyClass2) {
    mc.g()
    mc.h()
}

class MyClassAdaptedForLib2 : LibType2 {
    val field = MyClass2() // MyClass2 를 상속하지 않고, 합성을 통해 필드로 추가함

    override fun f1() = field.h()

    override fun f2() = field.g()
}

fun main() {
    val mc = MyClassAdaptedForLib2()
    // h()
    // g()
    utility111(mc)

    // g()
    // h()
    utility222(mc)

    // g()
    // h()
    useMyClass2(mc.field)
}
