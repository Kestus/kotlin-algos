package `2073_TimeNeededToBuyTickets`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TimeToBuyTicketsTest {
    private val solution1 = TimeToBuyTickets::solution1
    private val solution2 = TimeToBuyTickets::solution2

    private val caseArgs1 = intArrayOf(2, 3, 2) to 2
    private val expected1 = 6

    private val caseArgs2 = intArrayOf(5, 1, 1, 1) to 0
    private val expected2 = 8

    @Test
    fun solution1() {
        val solution = solution1
        val result1 = solution(caseArgs1.first, caseArgs1.second)
        Assertions.assertEquals(expected1, result1)

        val result2 = solution(caseArgs2.first, caseArgs2.second)
        Assertions.assertEquals(expected2, result2)
    }

    @Test
    fun solution2() {
        val solution = solution2
        val result1 = solution(caseArgs1.first, caseArgs1.second)
        Assertions.assertEquals(expected1, result1)

        val result2 = solution(caseArgs2.first, caseArgs2.second)
        Assertions.assertEquals(expected2, result2)
    }
}