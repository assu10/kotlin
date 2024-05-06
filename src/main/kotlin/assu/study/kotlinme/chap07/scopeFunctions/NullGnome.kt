package assu.study.kotlinme.chap07.scopeFunctions

class Gnome1(val name: String) {
    fun who() = "Gnome $name"
}

fun whichGnome(gnome: Gnome1?) {
    println(gnome?.name)
    gnome?.let { println(it.who()) }
    gnome?.run { println(who()) }
    gnome?.apply { println(who()) }
    gnome?.also { println(it.who()) }
}

fun main() {
    // Assu
    // Gnome Assu
    // Gnome Assu
    // Gnome Assu
    // Gnome Assu
    whichGnome(Gnome1("Assu"))

    // null
    whichGnome(null)
}
