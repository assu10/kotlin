package assu.study.kotlinme.chap06.unitTesting

import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun fortyTwo() = 42

// 단위 테스트
fun testFortyTwo(n: Int = 42) {
    assertEquals(
        expected = n,
        actual = fortyTwo(),
        message = "incorrect,",
    )
}

fun allGood(b: Boolean = true) = b

fun testAllGood(b: Boolean = true) {
    assertTrue(actual = allGood(b), message = "not good")
}

fun main() {
    testFortyTwo()
    testAllGood()

    // Exception in thread "main" java.lang.AssertionError: incorrect,. Expected <11>, actual <42>.
    testFortyTwo(11)

    // Exception in thread "main" java.lang.AssertionError: not good
    // testAllGood(false)
}
