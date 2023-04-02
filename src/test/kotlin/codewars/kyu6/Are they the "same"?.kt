package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Are they the "same"?` {
    @Test
    fun testFixed() {
        val a1 = intArrayOf(121, 144, 19, 161, 19, 144, 19, 11)
        val a2 = intArrayOf(11 * 11, 121 * 121, 144 * 144, 19 * 19, 161 * 161, 19 * 19, 144 * 144, 19 * 19)

        assertEquals(true, comp(a1, a2))
    }
}

fun comp(a: IntArray?, b: IntArray?): Boolean {
    if (a == null || b == null) return false
    return a.map { it * it }.sorted() == b.sorted()
}
