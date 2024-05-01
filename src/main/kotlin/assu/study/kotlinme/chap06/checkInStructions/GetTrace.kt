package assu.study.kotlinme.chap06.checkInStructions

fun getTrace(fileName: String): List<String> {
    // 파일명이 file_ 로 시작하는지 확인
    require(fileName.startsWith("file_")) {
        "$fileName must start with 'file_'"
    }

    // 파일이 존재하는지 확인
    val file = DataFile(fileName)
    require(file.exists()) {
        "$fileName doesn't exists"
    }

    // 파일이 비어있는지 확인
    val lines = file.readLines()
    require(lines.isNotEmpty()) {
        "$fileName is empty"
    }

    return lines
}

fun main() {
    DataFile("file_empty.txt").writeText("")
    DataFile("file_assu.txt").writeText("assu aa bb cc")

    // val result1 = getTrace("wrong_name.txt")
    // val result2 = getTrace("file_nonexistence.txt")
    // val result3 = getTrace("file_empty.txt")
    val result4 = getTrace("file_assu.txt")

    // Exception in thread "main" java.lang.IllegalArgumentException: wrong_name.txt must start with 'file_'
    // println(result1)

    // Exception in thread "main" java.lang.IllegalArgumentException: file_nonexistence.txt doesn't exists
    // println(result2)

    // Exception in thread "main" java.lang.IllegalArgumentException: file_empty.txt is empty
    // println(result3)

    println(result4) // [assu aa bb cc]
}
