package `0055_JumpGame`


// https://leetcode.com/problems/jump-game/
object JumpGame {
    fun solution1(nums: IntArray): Boolean {
        var max = 0
        var i = 0
        while (i <= max) {
            val new = nums[i] + i
            if (max < new) {
                max = new
                if (max >= nums.size-1) {
                    return true
                }
            }
            i++
        }
        return max >= nums.size-1
    }
}