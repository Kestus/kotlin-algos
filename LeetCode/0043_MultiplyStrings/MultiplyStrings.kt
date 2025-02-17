package `0043_MultiplyStrings`

// https://leetcode.com/problems/multiply-strings/
object MultiplyStrings {

    fun solution1(num1: String, num2: String): String {
        var result = ""
        var shiftString = ""
        for (i in num1.length-1 downTo 0) {
            val intI = num1[i].digitToInt()
            var row = ""
            var overflow = 0

            for (j in num2.length-1 downTo 0) {
                val intJ = num2[j].digitToInt()

                val mult = (intI * intJ) + overflow
                val remainder = mult % 10
                overflow = (mult - remainder) / 10
                row = remainder.toString() + row
            }
            if (overflow != 0) {
                row = overflow.toString() + row
            }
            row += shiftString
            shiftString += "0"

            result = addStrings(result, row)
        }

        result = result.dropWhile { it == '0' }
        return result.ifEmpty { "0" }
    }

    fun addStrings(num1: String, num2: String): String {
        var result = ""
        var string1 = num1
        var string2 = num2
        var overflow = 0
        while (string1.isNotEmpty() || string2.isNotEmpty()) {
            val int1 = string1.lastOrNull()?.digitToIntOrNull() ?: 0
            val int2 = string2.lastOrNull()?.digitToIntOrNull() ?: 0
            string1 = string1.dropLast(1)
            string2 = string2.dropLast(1)

            val sum = (int1 + int2) + overflow
            val remainder = sum % 10
            overflow = (sum - remainder) / 10
            result = remainder.toString() + result
        }
        if (overflow != 0) {
            result = overflow.toString() + result
        }
        return result
    }

    fun solution2(num1: String, num2: String): String {
        val len1 = num1.length
        val len2 = num2.length
        val array = IntArray(len1 + len2)

        for (i in len1 - 1 downTo 0) {
            val intI = num1[i] - '0'
            for (j in len2 - 1 downTo 0) {
                val intJ = num2[j] - '0'
                val carry = array[i+j+1]
                val mult = intI * intJ + carry
                val remainder = mult % 10
                array[i+j+1] = remainder
                array[i+j] += mult / 10
            }
        }

        val result = StringBuilder().apply {
            for (num in array) {
                if (!(this.isEmpty() && num == 0)) {
                    this.append(num)
                }
            }
        }.toString()

        return result.ifEmpty { "0" }
    }
}