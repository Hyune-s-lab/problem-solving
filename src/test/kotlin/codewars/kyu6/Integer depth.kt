package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Integer depth` {
    private fun runTest(n: Int, sol: Int) = assertEquals(sol, Kata.computeDepth(n))

    @Test
    fun `Sample tests`() {
        runTest(1, 10)
        runTest(42, 9)
        runTest(25, 36)
    }
}

object Kata {
    fun computeDepth(n: Int): Int {
        val digits = mutableSetOf<String>()
        var i = 0

        while (digits.size != 10) {
            i++
            (n * i).toString().chunked(1).forEach { digits.add(it) }
        }

        return i
    }
}
