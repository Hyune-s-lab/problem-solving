package codewars.kyu7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Highest and Lowest` {
    @Test
    fun test1() {
        assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    }

    @Test
    fun test2() {
        assertEquals("3 1", highAndLow("1 2 3"))
    }
}

fun highAndLow(numbers: String): String =
    numbers.split(" ").map { it.toInt() }
        .run { "${maxOrNull()} ${minOrNull()}" }
