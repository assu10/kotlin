package assu.study.kotlinme.chap05.inheritanceExtensions

// 타입을 정의함
interface LibType {
    fun f1()

    fun f2()
}

// 정의한 타입을 객체의 파라메터로 받음
fun utility1(lt: LibType) {
    lt.f1()
    lt.f2()
}

// 정의한 타입을 객체의 파라메터로 받음
fun utility2(lt: LibType) {
    lt.f2()
    lt.f1()
}
