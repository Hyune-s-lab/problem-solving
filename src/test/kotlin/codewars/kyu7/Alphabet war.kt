package codewars.kyu7

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `Alphabet war` {
    @Test
    fun testFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
    }
}

fun alphabetWar(fight: String): String {
    val left = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val right = mapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)
    val leftSum = fight.toCharArray().filter { left.keys.contains(it) }.mapNotNull { left[it] }.sum()
    val rightSum = fight.toCharArray().filter { right.keys.contains(it) }.mapNotNull { right[it] }.sum()

    if (leftSum > rightSum) {
        return "Left side wins!"
    }

    if (leftSum < rightSum) {
        return "Right side wins!"
    }

    return "Let's fight again!"
}
