package assu.study.kotlinme.chap07.delegationTools

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun aName(
    property: KProperty<*>,
    old: String,
    new: String,
) = if (new.startsWith("A")) {
    println("$old to $new ~")
    true
} else {
    println("11 name must start with 'A' ~")
    false
}

interface Captain {
    var captain: String
}

class TeamWithTraditions1 : Captain {
    override var captain: String by Delegates.vetoable("Assu", ::aName)
}

// Delegates.vetoable() 를 aName() 대신 람다를 사용하여 정의
class TeamWithTraditions2 : Captain {
    override var captain: String by Delegates.vetoable("Assu") { _, old, new ->
        if (new.startsWith("A")) {
            println("$old to $new ~~")
            true
        } else {
            println("22 name must start with 'A' ~~")
            false
        }
    }
}

fun main() {
    // Assu to ASSU1 ~
    // 11 name must start with 'A' ~
    // ASSU1
    // Assu to ASSU1 ~~
    // 22 name must start with 'A' ~~
    // ASSU1
    listOf(
        TeamWithTraditions1(),
        TeamWithTraditions2(),
    ).forEach {
        it.captain = "ASSU1"
        it.captain = "BSSU"

        println(it.captain)
    }
}
