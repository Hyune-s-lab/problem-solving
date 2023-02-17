import org.junit.jupiter.api.Test
import kotlin.math.pow
import kotlin.test.assertEquals

class `Square(n) Sum` {
    @Test
    fun `Sum of Squared Inputs`() {
        assertEquals(5, squareSum(arrayOf(1, 2)))
        assertEquals(50, squareSum(arrayOf(0, 3, 4, 5)))
        assertEquals(0, squareSum(arrayOf()))
    }
}

fun squareSum(n: Array<Int>): Int {
    return n.sumOf { it.toDouble().pow(2) }.toInt()
}
