package `1832_CheckIfSentenceIsPangram`

import java.util.BitSet


// https://leetcode.com/problems/check-if-the-sentence-is-pangram
object CheckIfPangram {
    fun solution1(sentence: String): Boolean {
        val bits = BitSet()
        // go through the sentence, map every char to its code representation.
        // set bit at that code to "true"
        for (code in sentence.toCharArray().map { it.code }) {
            bits.set(code - 'a'.code)
        }
        // If number of bits set to "true" == number of chars in alphabet: sentence is a Pangram.
        return bits.cardinality() == 26
    }

    // optimized a bit
    fun solution2(sentence: String): Boolean {
        val bits = BitSet()
        for (code in sentence.toCharArray().map { it.code }) {
            bits.set(code)
        }
        return bits.cardinality() == 26
    }
}

