package assu.study.kotlinme.chap05.sealedClasses

abstract class CustomAbstract(val av: String) {
    open fun concreteFunction() {}

    open val concreteProperty = ""

    abstract fun abstractFunction(): String

    abstract val abstractProperty: String

    // 주생성자
    init {}

    // 부생성자
    constructor(c: Char) : this(c.toString())
}

open class Concrete() : CustomAbstract("") {
    override fun concreteFunction() {}

    override val concreteProperty = ""

    override fun abstractFunction() = ""

    override val abstractProperty = ""
}

sealed class Sealed(val av: String) {
    open fun concreteFunction() {}

    open val concreteProperty = ""

    abstract fun abstractFunction(): String

    abstract val abstractProperty: String

    // 주생성자
    init {}

    // 부생성자
    constructor(c: Char) : this(c.toString())
}

open class SealedSubclass() : Sealed("") {
    override fun concreteFunction() {}

    override val concreteProperty = ""

    override fun abstractFunction() = ""

    override val abstractProperty = ""
}

fun main() {
    Concrete()
    SealedSubclass()
}
