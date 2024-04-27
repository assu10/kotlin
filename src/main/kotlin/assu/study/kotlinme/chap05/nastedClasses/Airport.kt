package assu.study.kotlinme.chap05.nastedClasses

import assu.study.kotlinme.chap05.nastedClasses.Airport.Plane

class Airport(private val code: String) {
    // 내포된 클래스 (Airport name space 안에 정의된 클래스)
    open class Plane {
        // 자신을 둘러싼 클래스의 private 프로퍼티(private val code)에 접근 가능
        fun contact(airport: Airport) = "contacting ${airport.code}"
    }

    // 내포된 클래스이면서 private
    private class PrivatePlane : Plane()

    // 결과를 public 타입인 Plane 으로 업캐스트하여 반환
    fun privatePlane(): Plane = PrivatePlane()
}

fun main() {
    val korea = Airport("KOR")

    // Plane 객체 생성 시 Airport 객체가 필요없음
    var plane = Plane()

    val result1 = plane.contact(korea)
    println(result1) // contacting KOR

    // 아래와 같은 오류가 뜨면서 컴파일되지 않음
    // Cannot access 'PrivatePlane': it is private in 'Airport'

    // val privatePlane = Airport.PrivatePlane()

    val japan = Airport("JPN")
    plane = japan.privatePlane()
    val result2 = plane.contact(japan)

    println(result2) // contacting JPN

    // 컴파일 오류
    // 외부에서 받은 public 타입의 객체 참조(Plane) 을 다시 private 타입(PrivatePlane) 으로 다운캐스트 불가
    // val p = plane as PrivatePlane
}
