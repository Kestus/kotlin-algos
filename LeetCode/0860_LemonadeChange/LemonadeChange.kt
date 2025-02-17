package `0860_LemonadeChange`


object LemonadeChange {
    fun solution1(bills: IntArray): Boolean {
        var fives = 0
        var tens = 0

        for (bill in bills) {
            when (bill) {
                5 -> fives++
                10 -> tens++
            }

            var change = bill - 5
            while (change > 0) {
                when (change) {
                    15 -> {
                        if (tens > 0) {
                            tens--
                            change -= 10
                        } else {
                            fives--
                            change -= 5
                        }
                    }

                    else -> {
                        fives--
                        change -= 5
                    }
                }
            }
            if (fives < 0 || tens < 0) {
                return false
            }
        }
        return true
    }
}
