package `0073_SetMatrixZeroes`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SetMaxZeroesTest {

    private lateinit var matrix1: Array<IntArray>
    private val expected1 = arrayOf(
        intArrayOf(1, 0, 1),
        intArrayOf(0, 0, 0),
        intArrayOf(1, 0, 1)
    )
    private lateinit var matrix2: Array<IntArray>
    private val expected2 = arrayOf(
        intArrayOf(0, 0, 0, 0),
        intArrayOf(0, 4, 5, 0),
        intArrayOf(0, 3, 1, 0)
    )
    private val solution1 = SetMaxZeroes::solution1
    private val solution2 = SetMaxZeroes::solution2

    @BeforeEach
    fun setUp() {
        matrix1 = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1)
        )

        matrix2 = arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5)
        )
    }

    @Test
    fun solution1() {
        solution1(matrix1)
        Assertions.assertArrayEquals(expected1, matrix1)
        solution1(matrix2)
        Assertions.assertArrayEquals(expected2, matrix2)
    }

    @Test
    fun solution2() {
        solution2(matrix1)
        Assertions.assertArrayEquals(expected1, matrix1)
        solution2(matrix2)
        Assertions.assertArrayEquals(expected2, matrix2)
    }
}