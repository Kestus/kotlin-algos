package `2232_MinimizeResultByAddingParenthesesToExpression`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


// https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression
private typealias solutionSignature = (String) -> String

class MinimizeResultTest {
    val solution1 = MinimizeResult::solution1
    val solution2 = MinimizeResult::solution2

    @Test
    fun solution1() {
        testCase1(solution1)
        testCase2(solution1)
        testCase3(solution1)
    }

    @Test
    fun solution2() {
        testCase1(solution2)
        testCase2(solution2)
        testCase3(solution2)
    }

    private fun testCase1(solution: solutionSignature) {
        val result = solution("247+38")
        Assertions.assertEquals("2(47+38)", result)
    }

    private fun testCase2(solution: solutionSignature) {
        val result = solution("12+34")
        Assertions.assertEquals("1(2+3)4", result)
    }

    private fun testCase3(solution: solutionSignature) {
        val result = solution("999+999")
        Assertions.assertEquals("(999+999)", result)
    }


//    val evalString = MinimizeResult::evalString
//    @Test
//    fun evalStringTest1() {
//        val result = evalString("(123+456)")
//        Assertions.assertEquals(579, result)
//    }
//
//    @Test
//    fun evalStringTest2() {
//        val result = evalString("1(23+4)56")
//        Assertions.assertEquals(1512, result)
//    }
//
//    @Test
//    fun evalStringTest3() {
//        val result = evalString("2(47+38)")
//        Assertions.assertEquals(170, result)
//    }

}