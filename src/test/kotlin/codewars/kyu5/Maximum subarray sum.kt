package codewars.kyu5

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Maximum subarray sum` {
    @Test
    fun `it should work on an empty list`() {
        assertEquals(0, maxSequence(emptyList()))
    }

    @Test
    fun `it should work on the example`() {
        assertEquals(6, maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

    @Test
    fun `it should work on the example2`() {
        assertEquals(0, maxSequence(listOf(-1, -1)))
    }
}

fun maxSequence(arr: List<Int>): Int {
    val result = arr.runningReduce { acc, num -> maxOf(num, acc + num) }.maxOrNull() ?: 0
    return if (result < 0) {
        0
    } else result
}
