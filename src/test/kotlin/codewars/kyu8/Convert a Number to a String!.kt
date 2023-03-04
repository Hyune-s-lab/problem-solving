package codewars.kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Convert a Number to a String!` {
    @Test
    fun testFixed() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
        assertEquals("-100", numberToString(-100))
        assertEquals("-999", numberToString(-999))
    }
}

fun numberToString(num: Int): String {
    return num.toString()
}
