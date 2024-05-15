package assu.study.kotlinme.chap07.delegationTools

import kotlin.properties.Delegates

class Team {
    var msg = ""
    var captain: String by Delegates.observable("INIT임 ") { prop, old, new ->
        msg += "${prop.name} : $old to $new ~\n"
    }
}

fun main() {
    val team = Team()
    team.captain = "assu"
    team.captain = "silby"

    // captain : INIT임  to assu ~
    // captain : assu to silby ~
    println(team.msg)
}
