package assu.study.kotlinme.chap07.extensionLambdas

val characters: List<String> =
    buildList {
        add("Chars: ")
        ('a'..'d').forEach { add("$it") }
    }

val charMap: Map<Char, Int> =
    buildMap {
        ('a'..'d').forEachIndexed { n, ch -> put(ch, n) }
    }

fun main() {
    println(characters) // [Chars: , a, b, c, d]
    println(charMap) // {a=0, b=1, c=2, d=3}
}
