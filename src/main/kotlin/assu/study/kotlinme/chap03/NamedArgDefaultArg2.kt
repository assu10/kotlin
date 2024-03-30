package assu.study.kotlinme.chap03

class CustomDefaultArg

val cda = CustomDefaultArg()

// 디폴트 인자로 객체 인스턴스 전달
fun g(d: CustomDefaultArg = cda) = println(d)

// 디폴트 인자로 함수를 호출
fun h(d: CustomDefaultArg = CustomDefaultArg()) = println(d)

fun main() {
    g()
    g()
    h()
    h()

    // g() 는 여러 번 호출해도 같은 인스턴스가 반복해서 전달됨
    // assu.study.kotlin_me.chap03.CustomDefaultArg@10f87f48
    // assu.study.kotlin_me.chap03.CustomDefaultArg@10f87f48

    // h() 는 호출할 때마다 새로운 인스턴스가 생성됨
    // assu.study.kotlin_me.chap03.CustomDefaultArg@b4c966a
    // assu.study.kotlin_me.chap03.CustomDefaultArg@2f4d3709
}
