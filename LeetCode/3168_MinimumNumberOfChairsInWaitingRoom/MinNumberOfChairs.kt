package `3168_MinimumNumberOfChairsInWaitingRoom`

import org.junit.jupiter.api.Assertions.assertTrue

object MinNumberOfChairs {
    fun solution1(s: String): Int {
        var max = 0
        var currently = 0
        for (char in s) {
            if (char == 'E') {
                currently++
            } else {
                currently--
            }
            if (currently > max) max = currently
        }
        return max
    }
}