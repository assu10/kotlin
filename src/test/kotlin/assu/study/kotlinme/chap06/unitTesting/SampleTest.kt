package assu.study.kotlinme.chap06.unitTesting

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.expect

class SampleTest {
    @Test
    fun testFortyTwo() {
        expect(expected = 42, message = "Incorrect,") { fortyTwo() }
    }

    @Test
    fun testAllGood() {
        assertTrue(actual = allGood(), "not good")
    }
}
