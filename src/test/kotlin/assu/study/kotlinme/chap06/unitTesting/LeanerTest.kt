package assu.study.kotlinme.chap06.unitTesting

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun makeLeaner(
    id: Int,
    language: Language = Language.Kotlin,
    name: String = "Test Name: $id",
    surname: String = "Test Surname: $id",
) = Leaner(id, name, surname, language)

class LeanerTest {
    @Test
    fun `single Learner`() {
        val leaner = makeLeaner(10, Language.Java)
        assertEquals(expected = "Test name: 10", actual = leaner.name)
    }

    @Test
    fun `multiple Learners`() {
        val learners = (1..9).map(::makeLeaner)
        assertTrue(learners.all { it.language == Language.Kotlin })
    }
}
