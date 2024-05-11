package assu.study.kotlinme.chap07.creatingGenerics

interface Parent

interface Child : Parent

interface X {
    fun f(): Parent
}

interface Y : X {
    // X 의 f() 보다 더 하위 타입을 반환함
    override fun f(): Child
}
