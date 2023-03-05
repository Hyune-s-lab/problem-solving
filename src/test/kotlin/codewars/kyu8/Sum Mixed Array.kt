package codewars.kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Sum Mixed Array` {
    private val mixedSum = MixedSum()

    @Test
    fun test_1() {
        assertEquals(10, mixedSum.sum(listOf(5, "5")))
    }

    @Test
    fun test_2() {
        assertEquals(22, mixedSum.sum(listOf(9, 3, "7", "3")))
    }

    @Test
    fun test_3() {
        assertEquals(42, mixedSum.sum(listOf("5", "0", 9, 3, 2, 1, "9", 6, 7)))
    }

    @Test
    fun test_4() {
        assertEquals(41, mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")))
    }

    @Test
    fun test_5() {
        assertEquals(45, mixedSum.sum(listOf("1", "5", "8", 8, 9, 9, 2, "3")))
    }

    @Test
    fun test_6() {
        assertEquals(41, mixedSum.sum(listOf("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")))
    }

    @Test
    fun test_7() {
        assertEquals(61, mixedSum.sum(listOf(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)))
    }
}

class MixedSum {
    fun sum(mixed: List<Any>): Int {
        return mixed.sumOf {
            if (it is String) {
                it.toInt()
            } else {
                it as Int
            }
        }
    }
}
