package assu.study.kotlinme.chap05.compositions

class Features {
    fun f1() = "feature1"

    fun f2() = "feature2"
}

class Form {
    // 합성
    private val features = Features()

    fun operation1() = features.f2() + features.f1()

    fun operation2() = features.f1() + features.f2()
}
