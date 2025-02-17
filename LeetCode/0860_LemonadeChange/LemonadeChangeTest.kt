package `0860_LemonadeChange`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LemonadeChangeTest {
    private val solution = LemonadeChange::solution1
    private val bills1 = intArrayOf(5,5,5,10,20)
    private val bills2 = intArrayOf(5,5,10,10,20)

    @Test
    fun solution1Bills1() {
        val result = solution(bills1)
        Assertions.assertTrue(result)
    }

    @Test
    fun solution1Bills2() {
        val result = solution(bills2)
        Assertions.assertFalse(result)
    }
}