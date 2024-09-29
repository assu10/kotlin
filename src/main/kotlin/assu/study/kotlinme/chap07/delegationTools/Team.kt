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
    team.captain = "silby2"

    // captain : INIT임  to assu ~
    // captain : assu to silby ~
    // captain : silby to silby2 ~
    println(team.msg)
}
