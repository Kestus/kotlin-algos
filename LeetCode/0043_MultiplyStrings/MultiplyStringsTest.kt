package `0043_MultiplyStrings`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MultiplyStringsTest {
    private val solution1 = MultiplyStrings::solution1
    private val solution2 = MultiplyStrings::solution2

    @Test
    fun testSolution1() {
        val result1 = solution1("2", "3")
        Assertions.assertEquals(result1, "6")

        val result2 = solution1("123", "456")
        Assertions.assertEquals("56088", result2)

        val result3 = solution1("23958233", "5830")
        Assertions.assertEquals("139676498390", result3)

        val result4 = solution1("11", "22")
        Assertions.assertEquals("242", result4)

        val result5 = solution1("9133", "0")
        Assertions.assertEquals("0", result5)
    }

    @Test
    fun testSolution2() {
        val result1 = solution2("2", "3")
        Assertions.assertEquals(result1, "6")

        val result2 = solution2("123", "456")
        Assertions.assertEquals("56088", result2)

        val result3 = solution2("23958233", "5830")
        Assertions.assertEquals("139676498390", result3)

        val result4 = solution2("11", "22")
        Assertions.assertEquals("242", result4)

        val result5 = solution2("9133", "0")
        Assertions.assertEquals("0", result5)
    }





}