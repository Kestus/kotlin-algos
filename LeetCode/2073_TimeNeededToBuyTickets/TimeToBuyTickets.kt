package `2073_TimeNeededToBuyTickets`

import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.math.min

object TimeToBuyTickets {

    // simulated approach
    fun solution1(tickets: IntArray, k: Int): Int {
        var timer = 0
        var position = k
        var queue = tickets

        while (position >= 0) {
            if (position == 0) { // kth person is at the start of the queue
                if (queue[position] == 1) { // has only one more ticket to but
                    position = -1
                } else { // else kth person goes to the end of the queue with 1 less ticket to buy
                    queue = shiftFirst(queue)
                    position = queue.size - 1
                }
            } else { // not kth person at the start of the queue
                queue = if (queue[0] == 1) { // person at the start of the queue has only one more ticket to buy
                    removeFirst(queue)
                } else { // person at the start of the queue has more than one ticket to buy
                    shiftFirst(queue)
                }
                // each time kth person position shifts "forward"
                position--
            }
            timer++ // every cycle timer goes up by one
        }
        return timer
    }

    // remove first Int from IntArray, return new array of old size - 1
    private fun removeFirst(oldArray: IntArray): IntArray {
        val newSize = oldArray.size - 1
        val newArray: IntArray = IntArray(newSize)
        for (i in 1 until oldArray.size) {
            newArray[i - 1] = oldArray[i]
        }
        return newArray
    }

    // shift first Int in array to the end, and decrease it by 1
    private fun shiftFirst(oldArray: IntArray): IntArray {
        val newArray = IntArray(oldArray.size)
        for (i in 1 until oldArray.size) {
            newArray[i - 1] = oldArray[i]
        }
        newArray[newArray.size - 1] = oldArray[0] - 1
        return newArray
    }

    // no simulation
    fun solution2(tickets: IntArray, k: Int): Int {
        var timer = 0
        for (i in tickets.indices) {
            timer += if (i <= k) min(tickets[i], tickets[k])
            else min(tickets[i], tickets[k] - 1)
        }
        return timer
    }
}

