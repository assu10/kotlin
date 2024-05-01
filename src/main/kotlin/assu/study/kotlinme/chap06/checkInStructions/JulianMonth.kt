package assu.study.kotlinme.chap06.checkInStructions

data class Month(val monthNumber: Int) {
    init {
        require(monthNumber in 1..12) {
            "Month out of range: $monthNumber"
        }
    }
}

fun main() {
    // Month(monthNumber=1)
    println(Month(1))

    // Exception in thread "main" java.lang.IllegalArgumentException: Month out of range: 13
    println(Month(13))
}
