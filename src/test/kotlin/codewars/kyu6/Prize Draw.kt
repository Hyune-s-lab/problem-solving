package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Prize Draw` {
    private fun dotest(expect: String, st: String, we: IntArray, n: Int) {
        val actual = nthRank(st, we, n)
        assertEquals(expect, actual)
    }

    @Test
    fun `Fixed tests`() {
        // no participant
        var st = ""
        var we = intArrayOf(4, 2, 1, 4, 3, 1, 2)
        dotest("No participants", st, we, 4)
        // n = 8 is greater than the number of participants
        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin"
        we = intArrayOf(4, 2, 1, 4, 3, 1, 2)
        dotest("Not enough participants", st, we, 8)
        //
        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin"
        we = intArrayOf(4, 2, 1, 4, 3, 1, 2)
        dotest("Benjamin", st, we, 4)
        // length of we is greater than the number of participants
        st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden"
        we = intArrayOf(1, 3, 5, 5, 3, 6, 1)
        dotest("Matthew", st, we, 2)
    }
}

fun nthRank(st: String, we: IntArray, n: Int): String {
    if (st.isEmpty()) {
        return "No participants"
    }

    val names = st.split(",")

    if (names.size < n) {
        return "Not enough participants"
    }

    val sortedBy = names.map { it.length + it.uppercase().toCharArray().sumOf { it.code - 64 } }
        .mapIndexed { index, i -> Pair(i * we[index], names[index]) }
        .sortedByDescending { it.first }

    return sortedBy[n - 1].second
}
