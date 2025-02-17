package `0976_LargestPerimeterTriangle`

/*  https://leetcode.com/problems/largest-perimeter-triangle
    Given array of integers, return largest perimeter of a triangle with non-zero area,
    formed from three of these lengths.
    If it is impossible to form any triangle of a non-zero area, return 0.
 */
object LargestPerimeterTriangle {

    fun solution1(nums: IntArray): Int {
        val sorted = nums.sort()
        var result = 0
        for (i in 0 until nums.size - 2) {
            val a = nums[i]
            val b = nums[i+1]
            val c = nums[i+2]

            if (a + b > c && a + c > b && b + c > a) {
                result = a + b + c
            }
        }
        return result
    }

    fun solution2(nums: IntArray): Int {
        val sorted = nums.sort()
        for (i in nums.size-1 downTo 2) {
            if (nums[i] + nums[i-1] > nums[i-2]
                && nums[i] + nums[i-2] > nums[i-1]
                && nums[i-1] + nums[i-2] > nums[i]) {
                return nums[i] + nums[i-1] + nums[i-2]
            }
        }
        return 0
    }

}