package `1491_AverageSalaryExcludingMinimumAndMaximum`

import org.junit.Test
import org.junit.jupiter.api.Assertions


// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class AverageSalaryExcludingTest {
    private val solution1 = AverageSalaryExcluding::solution1

    private val case1 = intArrayOf(4000, 3000, 1000, 2000)
    private val expectation1 = 2500.00000
    private val case2 = intArrayOf(1000,2000,3000)
    private val expectation2 = 2000.00000

    @Test
    fun solution1Test() {
        val result1 = solution1(case1)
        Assertions.assertEquals(expectation1, result1)

        val result2 = solution1(case2)
        Assertions.assertEquals(expectation2, result2)
    }

}

