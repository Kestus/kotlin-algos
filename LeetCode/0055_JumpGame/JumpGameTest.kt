package `0055_JumpGame`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/jump-game/
class JumpGameTest {

    private val solution1 = JumpGame::solution1
    private val case1 = intArrayOf(2,3,1,1,4)
    private val case2 = intArrayOf(3,2,1,0,4)

    @Test
    fun solution1Test() {
        val result1 = solution1(case1)
        Assertions.assertTrue(result1)

        val result2 = solution1(case2)
        Assertions.assertFalse(result2)
    }
}