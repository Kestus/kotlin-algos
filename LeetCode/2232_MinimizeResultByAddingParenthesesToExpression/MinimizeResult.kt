package `2232_MinimizeResultByAddingParenthesesToExpression`


// https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression
object MinimizeResult {
    // simulate with inserting brackets to string (slow)
    fun solution1(expression: String): String {
        val firstExp = insertBrackets(expression, 0, 0)
        var minPair = Pair(
            evalString(firstExp),
            firstExp
        )
        val addends = expression.split("+")
        for (i in 0 until addends[0].length) {
            for (j in 0 until addends[1].length) {
                val expr = insertBrackets(expression, i, j)
                val eval = evalString(expr)
                if (eval < minPair.first) minPair = eval to expr
            }
        }
        return minPair.second
    }

    fun insertBrackets(expression: String, left: Int, right: Int): String {
        val addends = expression.split("+")
        val l1 = addends[0].take(left)
        val l2 = addends[0].drop(left)
        val r1 = addends[1].dropLast(right)
        val r2 = addends[1].takeLast(right)
        return "$l1($l2+$r1)$r2"
    }

    fun evalString(expression: String): Int {
        val list = expression.split("+").map {
            it.split("[()]".toRegex())
                .map { s -> s.ifEmpty { "1" }.toInt() }
        }
        return list[0][0] * (list[0][1] + list[1][0]) * list[1][1]
    }


    // without any simulation
    fun solution2(expression: String): String {
        val addends = expression.split("+")
        var minStr = ""
        var minEval = Int.MAX_VALUE
        for (i in 0 until addends[0].length) {
            for (j in 0 until addends[1].length) {
                val l1 = addends[0].take(i)
                val l2 = addends[0].drop(i)
                val r1 = addends[1].dropLast(j)
                val r2 = addends[1].takeLast(j)
                val eval = l1.ifEmpty { "1" }.toInt() * (l2.toInt() + r1.toInt()) * r2.ifEmpty { "1" }.toInt()
                if (eval < minEval) {
                    minEval = eval
                    minStr = "$l1($l2+$r1)$r2"
                }
            }
        }
        return minStr
    }
}

