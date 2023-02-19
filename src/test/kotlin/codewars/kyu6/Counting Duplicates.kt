package codewars.kyu6

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Counting Duplicates` {
    @Test
    fun `abcde returns zero`() {
        assertEquals(0, duplicateCount("abcde"))
    }

    @Test
    fun `abcdea returns one`() {
        assertEquals(1, duplicateCount("abcdea"))
    }

    @Test
    fun `indivisibility returns one`() {
        assertEquals(1, duplicateCount("indivisibility"))
    }

    @Test
    fun `really long string containing duplicates returns three`() {
        val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
        assertEquals(3, duplicateCount(text))
    }
}

fun duplicateCount(text: String): Int {
    return text.groupingBy { it.lowercaseChar() }.eachCount()
        .count { it.value > 1 }
}
