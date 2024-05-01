package assu.study.kotlinme.chap06.checkInStructions

import java.io.File
import java.nio.file.Paths

var targetDir = File("DataFiles")

class DataFile(val fileName: String) : File(targetDir, fileName) {
    init {
        if (!targetDir.exists()) {
            targetDir.mkdir()
        }
    }

    private fun erase() {
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
    println(DataFile("Test.txt").reset().toString()) // DataFiles/Test.txt
    println(Paths.get("DataFiles", "Test.txt").toString()) // DataFiles/Test.txt
}
