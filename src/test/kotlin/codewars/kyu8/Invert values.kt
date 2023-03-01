package codewars.kyu8

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class `Invert values` {
    @Test
    fun testFixed() {
        assertArrayEquals(intArrayOf(-1, -2, -3, -4, -5), invert(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(-1, 2, -3, 4, -5), invert(intArrayOf(1, -2, 3, -4, 5)))
        assertArrayEquals(intArrayOf(), invert(intArrayOf()))
        assertArrayEquals(intArrayOf(0), invert(intArrayOf(0)))
    }
}

fun invert(arr: IntArray): IntArray {
    return arr.map { it * -1 }.toIntArray()
}
