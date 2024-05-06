package assu.study.kotlinme.chap07.creatingGenerics

// 타입 파라메터로 T 를 받고, T 를 반환
fun <T> gFunction(arg: T): T = arg

// T 를 저장
class GClass<T>(val x: T) {
    // T 반환
    fun f(): T = x
}

// 클래스 안에서 멤버 함수를 파라메터화함
class GMemberFunction {
    fun <T> f(arg: T): T = arg
}

// interface 가 제네릭 파라메터를 받는 경우
// 이 인터페이스를 구현하는 클래스는 GImplementation 클래스처럼 타입 파라메터를 재정의하거나,
// ConcreteImplementation 클래스처럼 타입 파라메터에 구체적인 타입 인자를 제공해야 함
interface GInterface<T> {
    val x: T

    fun f(): T
}

class GImplementation<T>(override val x: T) : GInterface<T> {
    override fun f(): T = x
}

class ConcreteImplementation : GInterface<String> {
    override val x: String
        get() = "x~"

    override fun f() = "f()~"
}

fun basicGenerics() {
    gFunction("Red")
    gFunction(1)
    gFunction(Dog())
    gFunction(Dog()).bark()

    GClass("AAA").f()
    GClass(11).f()
    GClass(Dog()).f().bark()

    GMemberFunction().f("AAA")
    GMemberFunction().f(11)
    GMemberFunction().f(Dog()).bark()

    GImplementation("AA").f()
    GImplementation(11).f()
    GImplementation(Dog()).f().bark()

    ConcreteImplementation().f()
    ConcreteImplementation().x
}
