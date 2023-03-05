package codewars.kyu8

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class `Count of positives sum of negatives` {
    @Test
    fun testFixed() {
        assertArrayEquals(
            arrayOf(10, -65),
            countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15))
        )
        assertArrayEquals(
            arrayOf(8, -50),
            countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14))
        )
        assertArrayEquals(
            arrayOf(),
            countPositivesSumNegatives(null)
        )
        assertArrayEquals(
            arrayOf(),
            countPositivesSumNegatives(arrayOf())
        )
    }
}

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    if (input.isNullOrEmpty()) {
        return emptyArray()
    }

//    return input.fold(arrayOf(0, 0)) { acc, i ->
//        when {
//            i > 0 -> arrayOf(acc[0] + 1, acc[1])
//            i < 0 -> arrayOf(acc[0], acc[1] + i)
//            else -> arrayOf(acc[0], acc[1])
//        }
//    }

    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.count(), negative.sum())
}
