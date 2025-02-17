package `0073_SetMatrixZeroes`

// https://leetcode.com/problems/set-matrix-zeroes/
object SetMaxZeroes {
    fun solution1(matrix: Array<IntArray>): Unit {
        val height = matrix.size
        val width = matrix[0].size
        val rows = mutableSetOf<Int>()
        val cols = mutableSetOf<Int>()
        for (i in 0 until height) {
            for (j in 0 until width) {
                if (matrix[i][j] == 0) {
                    cols.add(j)
                    rows.add(i)
                }
            }
        }

        for (row in rows) {
            for (i in 0 until width) {
                matrix[row][i] = 0
            }
        }
        for (col in cols) {
            for (i in 0 until height) {
                matrix[i][col] = 0
            }
        }
    }

    fun solution2(matrix: Array<IntArray>): Unit {
        val positions = mutableListOf<Pair<Int, Int>>()

        for (r in matrix.indices) {
            for (c in matrix[r].indices) {
                if (matrix[r][c] == 0) {
                    positions.add(r to c)
                }
            }
        }

        for ((r, c) in positions) {
            for (i in matrix[0].indices) {
                matrix[r][i] = 0
            }
            for (j in matrix.indices) {
                matrix[j][c] = 0
            }
        }
    }
}

