package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.math.pow

class `Playing with digits` {
    @Test
    fun testFixed() {
        assertEquals(1, digPow(89, 1))
        assertEquals(-1, digPow(92, 1))
        assertEquals(51, digPow(46288, 3))
    }
}

fun digPow(n: Int, p: Int): Int {
    return n.toString()
        .mapIndexed { i, c -> c.toString().toDouble().pow(p + i).toInt() }
        .sum()
        .let { if (it % n == 0) it / n else -1 }
}

//fun digPow(n: Int, p: Int): Int {
//    var sum = 0
//    for ((index, i) in splitDigits(n).withIndex()) {
//        sum += i.toDouble().pow((p + index).toDouble()).toInt()
//    }
//
//    if (sum % n == 0) {
//        return sum / n
//    }
//
//    return -1
//}
//
//fun splitDigits(num: Int): List<Int> {
//    val digits = mutableListOf<Int>()
//    var n = num
//    while (n > 0) {
//        digits.add(n % 10)
//        n /= 10
//    }
//    return digits.reversed()
//}
