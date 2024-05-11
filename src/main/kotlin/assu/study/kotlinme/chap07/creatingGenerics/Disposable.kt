package assu.study.kotlinme.chap07.creatingGenerics

interface Disposable {
    val name: String

    fun action(): String
}

class Compost(override val name: String) : Disposable {
    override fun action() = "add to compost~"
}

interface Transport : Disposable

class Donation(override val name: String) : Transport {
    override fun action() = "add to donation~"
}

class Recyclable(override val name: String) : Transport {
    override fun action() = "add to recyclable~"
}

class Landfill(override val name: String) : Transport {
    override fun action() = "add to landfill~"
}

val items =
    listOf(
        Compost("AAA"),
        Compost("BBB"),
        Donation("CCC"),
        Donation("DDD"),
        Recyclable("EEE"),
        Recyclable("FFF"),
        Landfill("GGG"),
    )

val recyclables = items.filterIsInstance<Recyclable>()
