package assu.study.kotlinme.chap03.dataclass

data class Key(val name: String, val id: Int)

fun main() {
    val aa: Key = Key("assu", 1)
    println(aa.hashCode()) // 93121645

    val map = HashMap<Key, String>()
    map[aa] = "assu1"
    println(map[aa].equals("assu1")) // true

    val set = HashSet<Key>()
    set.add(aa)
    println(set.contains(aa)) // true
}
