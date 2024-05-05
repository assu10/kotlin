package assu.study.kotlinme.chap06.unitTesting

import kotlin.test.Test
import kotlin.test.assertEquals

class StateMachineTest {
    val sm = StateMachine()

    @Test
    fun start() {
        sm.start()
        assertEquals(expected = State.On, actual = sm.state)
    }

    @Test
    fun `pause and resume`() {
        sm.start()
        sm.pause()
        assertEquals(expected = State.Paused, actual = sm.state)

        sm.resume()
        assertEquals(expected = State.On, actual = sm.state)

        sm.pause()
        assertEquals(expected = State.Paused, actual = sm.state)
    }
}
