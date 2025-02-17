package `1232_CheckStraightLine`

import org.junit.Test
import org.junit.jupiter.api.Assertions

class CheckStraightLineTest {
    private val solution1 = CheckStraightLine::solution1

    private val case1 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 3),
        intArrayOf(3, 4),
        intArrayOf(4, 5),
        intArrayOf(5, 6),
        intArrayOf(6, 7),
    )
    private val case2 = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(2, 2),
        intArrayOf(3, 4),
        intArrayOf(4, 5),
        intArrayOf(5, 6),
        intArrayOf(7, 7),
    )
    private val case3 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 3),
        intArrayOf(3, 5),
    )
    private val case4 = arrayOf(
        intArrayOf(0, 0),
        intArrayOf(0, 1),
        intArrayOf(0, -1),
    )

    @Test
    fun solution1Case1() {
        val result = solution1(case1)
        Assertions.assertTrue(result)
    }

    @Test
    fun solution1Case2() {
        val result = solution1(case2)
        Assertions.assertFalse(result)
    }

    @Test
    fun solution1Case3() {
        val result = solution1(case3)
        Assertions.assertFalse(result)
    }

    @Test
    fun solution1Case4() {
        val result = solution1(case4)
        Assertions.assertTrue(result)
    }
}