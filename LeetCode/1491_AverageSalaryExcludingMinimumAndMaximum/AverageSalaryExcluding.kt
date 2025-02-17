package `1491_AverageSalaryExcludingMinimumAndMaximum`


// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
object AverageSalaryExcluding {
    fun solution1(salary: IntArray): Double {
        var max = salary[0]
        var min = salary[0]
        var sum = 0.0
        for (i in salary) {
            if (i > max) { max = i }
            if (i < min) { min = i }
            sum += i
        }
        return (sum - max - min) / (salary.size - 2)
    }
}