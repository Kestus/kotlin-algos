package `3168_MinimumNumberOfChairsInWaitingRoom`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

private typealias solutionSignature = (String) -> Int

class MinNumberOfChairsTest {

    private val solution1 = MinNumberOfChairs::solution1

    @Test
    fun solution1() {
        testCase1(solution1)
        testCase2(solution1)
    }


    private fun testCase1(solution: solutionSignature) {
        val result = solution("EEEEEEE")
        Assertions.assertEquals(7, result)
    }

    private fun testCase2(solution: solutionSignature) {
        val result = solution("ELELEEL")
        Assertions.assertEquals(2, result)
    }
}