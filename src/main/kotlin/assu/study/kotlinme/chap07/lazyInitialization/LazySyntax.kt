package assu.study.kotlinme.chap07.lazyInitialization

// 이 프로퍼티를 읽는 곳이 없으므로 결코 초기화되지 않음
val idle: String by lazy {
    println("initializing idle lazy~")
    "I'm never used~"
}

val helpful: String by lazy {
    println("initializing helpful lazy~")
    "I'm helpful~"
}

fun main() {
    // initializing helpful lazy~
    // I'm helpful~
    println(helpful)
}
