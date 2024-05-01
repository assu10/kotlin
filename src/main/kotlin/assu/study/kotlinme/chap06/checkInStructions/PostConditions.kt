package assu.study.kotlinme.chap06.checkInStructions

val resultFile = DataFile("result.txt")

fun createResultFile(create: Boolean) {
    if (create) {
        resultFile.writeText("result\n ok")
    }

    check(resultFile.exists()) {
        "$resultFile.name doesn't exist~"
    }
}

fun main() {
    resultFile.erase()

    // Exception in thread "main" java.lang.IllegalStateException: DataFiles/result.txt.name doesn't exist~
    // val result1 = createResultFile(false)

    // DataFiles/result.txt 가 생성됨
    createResultFile(true)
}
