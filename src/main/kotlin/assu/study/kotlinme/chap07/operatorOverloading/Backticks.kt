package assu.study.kotlinme.chap07.operatorOverloading

fun `A long name with spaces`() = println("111")

fun `*how* is func`() = println("222")

fun `'when' is hohoho`() = println("333")

// fun `Illigal characters: <>`() = println("444")

fun main() {
    `A long name with spaces`() // 111
    `*how* is func`() // 222
    `'when' is hohoho`() // 333
}
