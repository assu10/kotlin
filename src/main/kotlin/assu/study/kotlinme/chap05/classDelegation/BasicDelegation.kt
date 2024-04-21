package assu.study.kotlinme.chap05.classDelegation

interface A1

class A : A1

// 클래스 B 는 A1 인터페이스를 a 멤버 객체를 사용(by)하여 구현함
class B(val a: A) : A1 by a
