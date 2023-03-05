package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Highest Scoring Word` {
    @Test
    fun testFixed() {
        assertEquals("abad", high("abad"))
        assertEquals("taxi", high("man i need a taxi up to ubud"))
        assertEquals("volcano", high("what time are we climbing up the volcano"))
        assertEquals("semynak", high("take me to semynak"))
        assertEquals("aa", high("aa b"))
        assertEquals("b", high("b aa"))
        assertEquals("bb", high("bb d"))
        assertEquals("d", high("d bb"))
        assertEquals("aaa", high("aaa b"))
    }
}

fun high(str: String): String {
    return str.split(" ")
        .maxBy { it.sumOf { it.code - 96 } }

//    return str.split(" ")
//        .sortedByDescending { it.sumOf { it.code - 96 } }.first()
}
