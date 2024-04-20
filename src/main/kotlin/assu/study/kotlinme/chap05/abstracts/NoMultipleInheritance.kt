package assu.study.kotlinme.chap05.abstracts

open class Animal

open class Dog : Animal()

open class Cat : Animal()

// 기반 클래스가 둘 이상이면 아래와 같은 컴파일 오류
// Only one class may appear in a supertype list (상위 타입 목록에는 클래스가 단 하나만 올 수 있다는 의미)
// class Dolphin: Dog(), Cat()

interface A

interface B : A

interface C : A

// 인터페이스는 다중 상속 가능
class Dolphin2 : B, C
