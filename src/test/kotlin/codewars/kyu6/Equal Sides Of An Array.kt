package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Equal Sides Of An Array` {
    @Test
    fun test() {
        assertEquals(0, EqualSidesOfAnArray.findEvenIndex(intArrayOf(0)))
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 100, 50, -51, 1, 1)))
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 5, 6)))
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(20, 10, 30, 10, 10, 15, 35)))
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(-8505, -5130, 1926, -9026)))
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(2824, 1774, -1490, -9084, -9696, 23094)))
        assertEquals(6, EqualSidesOfAnArray.findEvenIndex(intArrayOf(4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4)))
    }
}

object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        return (0..arr.size).firstOrNull {
            arr.take(it).sum() == arr.drop(it + 1).sum()
        } ?: -1
    }
}
