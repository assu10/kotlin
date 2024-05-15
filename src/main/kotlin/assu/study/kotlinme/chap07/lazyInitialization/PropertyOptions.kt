package assu.study.kotlinme.chap07.lazyInitialization

fun compute(i: Int): Int {
    println("compute $i")
    return i
}

object Properties {
    val atDefinition = compute(1)
    val getter
        get() = compute(2)
    val lazyInit by lazy { compute(3) }
    val never by lazy { compute(4) }
}

fun main() {
    // atDefinition 은 Properties 의 인스턴스를 생성할 때 초기화됨

    // compute 1  - atDefinition: 보다 먼저 출력이 되었다는 건 초기화가 프로퍼티 접근 이전에 발생했다는 의미
    // atDefinition:
    // 1:
    // 1::

    // getter 는 프로퍼티에 접근할 때마다 getter 가 계산되므로 compute 가 2번 출력됨

    // getter:
    // compute 2
    // 2:
    // compute 2
    // 2::

    // lazyInit 프로퍼티에 처음 접근할 때 한번만 초기화가 계산됨

    // lazyInit:
    // compute 3
    // 3:
    // 3::
    listOf(
        Properties::atDefinition,
        Properties::getter,
        Properties::lazyInit,
    ).forEach {
        println("${it.name}:")
        println("${it.get()}:")
        println("${it.get()}::")
    }
}
