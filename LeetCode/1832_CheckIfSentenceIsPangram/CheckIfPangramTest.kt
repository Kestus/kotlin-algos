package `1832_CheckIfSentenceIsPangram`

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


// https://leetcode.com/problems/check-if-the-sentence-is-pangram
class CheckIfPangramTest {
    private val solution1 = CheckIfPangram::solution1
    private val solution2 = CheckIfPangram::solution2

    private val case1 = "thequickbrownfoxjumpsoverthelazydog"   // expected true
    private val case2 = "leetcode"                              // expected false

    @Test
    fun solution1() {
        val result1 = solution1(case1)
        Assertions.assertTrue(result1)
        val result2 = solution1(case2)
        Assertions.assertFalse(result2)
    }

    @Test
    fun solution2() {
        val result1 = solution2(case1)
        Assertions.assertTrue(result1)
        val result2 = solution2(case2)
        Assertions.assertFalse(result2)
    }
}