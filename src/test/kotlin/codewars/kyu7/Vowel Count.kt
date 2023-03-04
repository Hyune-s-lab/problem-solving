package codewars.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Vowel Count` {
    @Test
    fun testFixed() {
        assertEquals(5, getCount("abracadabra"))
        assertEquals(1, getCount("test"))
        assertEquals(3, getCount("example"))
    }
}

fun getCount(str: String): Int {
//    return str.fold(0) { acc: Int, c: Char -> acc + if ("aeiou".toCharArray().contains(c)) 1 else 0 }
    return str.count { it in "aeiou" }
}
