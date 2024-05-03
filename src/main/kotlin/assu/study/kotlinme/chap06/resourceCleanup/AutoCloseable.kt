package assu.study.kotlinme.chap06.resourceCleanup

import java.io.File

var targetDir = File("DataFiles")

class DataFile(val fileName: String) : File(targetDir, fileName) {
    init {
        if (!targetDir.exists()) {
            targetDir.mkdir()
        }
    }

    fun erase() {
        if (exists()) {
            delete()
        }
    }

    fun reset(): File {
        erase()
        createNewFile()
        return this
    }
}

fun main() {
    // result.txt 의 내용은 아래와 같음
    // result
    // ok
    val result =
        DataFile("result.txt")
            .bufferedReader()
            .use { it.readLines().first() }

    println(result) // result
}
