package assu.study.kotlinme.chap05.inheritance

// 이 클래스는 상속 가능
open class Parent

class Child : Parent()

// Child 는 `open` 되어 있지 않으므로 아래는 상속이 불가
// class GrandChild: Child()

// 이 클래스는 상속 불가
final class Single

// `final` 을 쓴 선언과 같은 효과
class AnotherSingle
