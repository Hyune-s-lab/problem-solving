package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Consecutive strings` {
    @Test
    fun test() {
        println("longestConsec Fixed Tests")
        testing(
            longestConsec(arrayOf("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"), 2),
            "abigailtheta"
        )
        testing(
            longestConsec(
                arrayOf(
                    "ejjjjmmtthh",
                    "zxxuueeg",
                    "aanlljrrrxx",
                    "dqqqaaabbb",
                    "oocccffuucccjjjkkkjyyyeehh"
                ), 1
            ), "oocccffuucccjjjkkkjyyyeehh"
        )

    }

    companion object {
        private fun testing(actual: String, expected: String) {
            assertEquals(expected, actual)
        }
    }
}

fun longestConsec(strarr: Array<String>, k: Int): String {
    if (strarr.isEmpty() || k > strarr.size || k <= 0) return ""
    return (0..strarr.size - k)
        .map { strarr.copyOfRange(it, it + k).joinToString("") }
        .maxBy { it.length }
}
