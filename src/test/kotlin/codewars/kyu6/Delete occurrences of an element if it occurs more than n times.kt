package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class `Delete occurrences of an element if it occurs more than n times` {
    @Test
    @Throws(Exception::class)
    fun deleteNth() {
        assertArrayEquals(
            intArrayOf(20, 37, 21),
            EnoughIsEnough.deleteNth(intArrayOf(20, 37, 20, 21), 1)
        )
        assertArrayEquals(
            intArrayOf(1, 1, 3, 3, 7, 2, 2, 2),
            EnoughIsEnough.deleteNth(intArrayOf(1, 1, 3, 3, 7, 2, 2, 2, 2), 3)
        )
        assertArrayEquals(
            intArrayOf(1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5),
            EnoughIsEnough.deleteNth(intArrayOf(1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1), 3)
        )
        assertArrayEquals(
            intArrayOf(1, 1, 1, 1, 1),
            EnoughIsEnough.deleteNth(intArrayOf(1, 1, 1, 1, 1), 5)
        )
        assertArrayEquals(
            intArrayOf(),
            EnoughIsEnough.deleteNth(intArrayOf(), 5)
        )
    }
}

//object EnoughIsEnough {
//    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
//        val limitCount = mutableMapOf<Int, Int>()
//        val result = elements
//            .map {
//                if (limitCount.getOrPut(it) { 0 } < maxOcurrences) {
//                    limitCount[it] = limitCount[it]!! + 1
//                    it
//                } else {
//
//                }
//            }.filter { it != Unit }
//            .map { it.toString().toInt() }
//            .toIntArray()
//
//        return result
//    }
//}

object EnoughIsEnough {
    fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
        val count = mutableMapOf<Int, Int>()

        return elements
            .asSequence()
            .onEach { count[it] = count.getOrDefault(it, 0) + 1 }
            .filter { count[it]!! <= maxOcurrences }
            .toList().toIntArray()
    }
}
