package assu.study.kotlinme.chap05.innerClasses

class Hotel(private val reception: String) {
    // inner class
    open inner class Room(val id: Int = 1) {
        // Room 을 둘러싼 클래스의 reception 사용
        fun callReception() = "Room $id calling $reception~"
    }

    // 내포된 inner class 이면서 private
    // inner class 인 Room 을 상속하므로 Closet 도 inner class 이어야 함
    // (내포된 클래스는 inner class 를 상속할 수 없음)
    private inner class Closet : Room()

    // 결과를 public 타입인 Room 으로 업캐스트하여 반환해야 함
    fun closet(): Room = Closet()
}

fun main() {
    val aaHotel = Hotel("AAA")

    // inner class 의 인스턴스를 생성하려면 그 inner class 를 둘러싼 클래스의 인스턴스가 필요
    val room = aaHotel.Room(111)
    val result1 = room.callReception()

    println(result1) // Room 111 calling AAA~

    // 아래와 같은 오류가 뜨면서 컴파일되지 않음
    // Classifier 'Closet' does not have a companion object, and thus must be initialized here

    // val privateCloset = Hotel.Closet()

    val bbHotel = Hotel("BBB")
    val closet = bbHotel.closet()
    val result2 = closet.callReception()

    println(result2) // Room 1 calling BBB~
}
