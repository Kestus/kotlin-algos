package `0976_LargestPerimeterTriangle`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


// https://leetcode.com/problems/largest-perimeter-triangle
/*
    Given array of integers, return largest perimeter of a triangle with non-zero area,
    formed from three of these lengths.
    If it is impossible to form any triangle of a non-zero area, return 0.
 */
class LargestPerimeterTriangleTest {

    private val solution1 = LargestPerimeterTriangle::solution1
    private val solution2 = LargestPerimeterTriangle::solution2
    private val case1 = intArrayOf(2,1,2)
    private val expected1 = 5
    private val case2 = intArrayOf(1,2,1,10)
    private val expected2 = 0

    @Test
    fun solution1Test() {
        val result1 = solution1(case1)
        Assertions.assertEquals(expected1, result1)

        val result2 = solution1(case2)
        Assertions.assertEquals(expected2, result2)
    }

    @Test
    fun solution2Test() {
        val result1 = solution2(case1)
        Assertions.assertEquals(expected1, result1)

        val result2 = solution2(case2)
        Assertions.assertEquals(expected2, result2)
    }
}