package assu.study.kotlinme.chap05.nastedClasses

interface Item {
    val type: Type

    // 인터페이스안에 내포된 클래스
    data class Type(val type: String)
}

class Bolt(type: String) : Item {
    override val type = Item.Type(type)
}

fun main() {
    val items = listOf(Bolt("aa"), Bolt("bb"))

    val result1 = items.map(Item::type)
    val result2 = items.map { Item::type } // Suspicious callable reference as the only lambda element

    // [Type(type=aa), Type(type=bb)]
    println(result1)

    // [val assu.study.kotlinme.chap05.nastedClasses.Item.type: assu.study.kotlinme.chap05.nastedClasses.Item.Type
    // , val assu.study.kotlinme.chap05.nastedClasses.Item.type: assu.study.kotlinme.chap05.nastedClasses.Item.Type]
    println(result2)
}
