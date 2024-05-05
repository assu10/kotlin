package assu.study.kotlinme.chap06.unitTesting

import kotlin.test.assertFails
import kotlin.test.assertFailsWith
import kotlin.test.expect

fun fortyTwo2() = 42

fun testFortyTwo2(n: Int = 42) {
    expect(expected = n, message = "Incorrect,") { fortyTwo2() }
}

fun main() {
    testFortyTwo2()

    // Exception in thread "main" java.lang.AssertionError:
    // Incorrect,. Expected <11>, actual <42>.

    // testFortyTwo2(11)

    assertFails { testFortyTwo2(11) }

    // Exception in thread "main" java.lang.AssertionError:
    // Expected an exception to be thrown, but was completed successfully.

    // assertFails { testFortyTwo2() }

    assertFailsWith<AssertionError> { testFortyTwo2(11) }

    // Exception in thread "main" java.lang.AssertionError:
    // Expected an exception of class java.lang.AssertionError to be thrown, but was completed successfully.

    // 던져진 예외의 타입까지 검사함
    assertFailsWith<AssertionError> { testFortyTwo2() }
}
