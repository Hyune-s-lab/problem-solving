package codewars.kyu7

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Shortest Word` {
    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }
}

fun findShort(s: String): Int {
    return s.split(" ").map { it.length }.minOf { it }
}
