package `1232_CheckStraightLine`

import org.junit.Test
import org.junit.jupiter.api.Assertions

object CheckStraightLine {
    fun solution1(coordinates: Array<IntArray>): Boolean {
        if (coordinates.size == 2) return true
        for (i in 0 until coordinates.size-2) {
            val x = coordinates[i]
            val y = coordinates[i+1]
            val z = coordinates[i+2]

            val area = 0.5 * (
                    x[0] * (y[1] - z[1]) +
                            y[0] * (z[1] - x[1]) +
                            z[0] * (x[1] - y[1])
                    )

            if (area != 0.0) return false

        }
        return true
    }
}

