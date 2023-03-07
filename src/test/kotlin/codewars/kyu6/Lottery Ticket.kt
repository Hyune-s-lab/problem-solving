package codewars.kyu6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Lottery Ticket` {
    @Test
    fun `Basic tests`() {
        assertEquals("Loser!", bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 2))
        assertEquals("Winner!", bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 1))
        assertEquals("Loser!", bingo(arrayOf("HGTYRE" to 74, "BE" to 66, "JKTY" to 74), 3))
    }
}

fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
//    if (ticket.mapNotNull { it.first.firstOrNull { it2 -> it2.code == it.second } }.count() >= win) {
//        return "Winner!"
//    }
//    return "Loser!"
    return if (ticket.count { it.second.toChar() in it.first } >= win) "Winner!" else "Loser!"
}
