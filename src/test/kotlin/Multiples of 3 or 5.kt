import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Multiples of 3 or 5` {
    @Test
    fun testFixed() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}

fun solution(number: Int): Int = (3 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
