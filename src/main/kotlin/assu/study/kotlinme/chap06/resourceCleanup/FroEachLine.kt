package assu.study.kotlinme.chap06.resourceCleanup

fun main() {
    val result =
        DataFile("result.txt").forEachLine {
            if (it.startsWith("#")) {
                println("it's $it")

                it
            }
        }

    println(result)
}
